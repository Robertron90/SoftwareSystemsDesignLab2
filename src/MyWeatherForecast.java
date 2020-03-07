public class MyWeatherForecast implements WeatherForecast {

    private WeatherDB weatherDB;

    private static MyWeatherForecast obj = new MyWeatherForecast();

    private MyWeatherForecast(){
    }

    public static MyWeatherForecast getInstance(WeatherDB weatherDB){
        if (obj.weatherDB == null) {
            obj.weatherDB = weatherDB;
        }
        return obj;
    }

    public ClientResponse predictWeatherForClient(ClientRequest request) {
        return null;
    }
}
