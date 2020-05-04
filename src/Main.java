import DB.Weather.MyWeatherDB;
import DB.Weather.WeatherDB;
import Factories.MyRequestFactory;
import Factories.RequestFactory;
import Entities.Responses.AdminResponse;
import Entities.Responses.ClientResponse;
import Entities.UserInfo.UserInfo;
import Interactor.UserAuthentication.MyUserAuthentication;
import Interactor.UserAuthentication.UserAuthentication;
import Interactor.WeatherForecast.MyWeatherForecast;
import Interactor.WeatherForecast.WeatherForecast;
import Memento.MyCareTaker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    UserAuthentication userAuthentication;
    RequestFactory requestFactory;
    WeatherForecast weatherForecast;
    WeatherDB weatherDB;
    MyCareTaker careTaker;

    public void start() {
        // start of Weather Forecast System

        // data of type will be used to mock json alike objects that came from the internet
        Map<String, String> data = new HashMap<>();
        UserInfo userInfo = userAuthentication.loginUser(data.get("userID"), data.get("userPassword"));
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        if (userInfo != null) {
            if (data.get("privilege").equals("admin")) {
                try {
                    AdminResponse adminResponse = weatherDB.addAdminWeather(
                            requestFactory.createAdminRequest(userInfo, Integer.parseInt(data.get("temp")),
                                                                Integer.parseInt(data.get("hum")),
                                                                Integer.parseInt(data.get("wind")),
                                                                data.get("loc"),
                                                                formatter.parse(data.get("time"))));
                    // send response back to Admin
                }
                catch (ParseException e){
                    e.printStackTrace();
                }
            } else if (data.get("privilege").equals("client")) {
                try {
                    ClientResponse clientResponse = weatherForecast.predictWeatherForClient(
                            requestFactory.createClientRequest(userInfo, Integer.parseInt(data.get("temp")),
                                                                Integer.parseInt(data.get("hum")),
                                                                Integer.parseInt(data.get("wind")),
                                                                data.get("loc"),
                                                                formatter.parse(data.get("time"))));
                    // send response back to Client
                }
                catch (ParseException e){
                    e.printStackTrace();
                }

            }
        }
    }

    public void stop() {
        // stop of Weather Forecast System
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.weatherDB = new MyWeatherDB();
        main.weatherForecast = MyWeatherForecast.getInstance(main.weatherDB);
        main.userAuthentication = new MyUserAuthentication();
        main.requestFactory = new MyRequestFactory();
        main.careTaker = new MyCareTaker();
    }

}
