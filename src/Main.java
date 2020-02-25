public class Main {
    UserAuthentication userAuthentication;
    RequestFactory requestFactory;
    WeatherForecast weatherForecast;
    WeatherDB weatherDB;

    public void start() {
        // start of Weather Forecast System

        // data of type will be used to mock json alike objects that came from the internet
        Map<String, String> data = new HashMap<>();
        UserInfo userInfo = userAuthentication.loginUser(data.get("userID"), data.get("userPassword"));
        if (userInfo != null) {
            if (data.get("privilege").equals("admin")) {
                AdminResponse adminResponse = weatherDB.addAdminWeather(
                        requestFactory.createAdminRequest(userInfo, data.get("temp"), data.get("hum"), data.get("wind"), data.get("loc"), data.get("time")));
                // send response back to Admin
            } else if (data.get("privilege").equals("client")) {
                ClientResponse clientResponse = weatherForecast.predictWeatherForClient(
                        requestFactory.createClientRequest(userInfo, data.get("temp"), data.get("hum"), data.get("wind"), data.get("loc"), data.get("time")));
                // send response back to Client
            }
        }
    }

    public void stop() {
        // stop of Weather Forecast System
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.weatherDB = new MyWeatherDB();
        main.weatherForecast = new MyWeatherForecast(main.weatherDB);
        main.userAuthentication = new MyUserAuthentication();
        main.requestFactory = new MyRequestFactory();
    }

}
