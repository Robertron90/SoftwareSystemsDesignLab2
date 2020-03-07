public class MyWeatherForecast implements WeatherForecast {

    private WeatherDB weatherDB;

    private static MyWeatherForecast obj = new MyWeatherForecast();

    private MyWeatherForecast(){
    }

    public void setWeatherDB(WeatherDB weatherDB){
        this.weatherDB = weatherDB;
    }

    public WeatherDB getWeatherDB(){
        return this.weatherDB;
    }

    public static MyWeatherForecast getInstance(){
        return obj;
    }

    public ClientResponse predictWeatherForClient(ClientRequest request) {
        return null;
    }
}
