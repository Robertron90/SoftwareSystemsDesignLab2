public class MyWeatherForecast implements WeatherForecast {

    private WeatherDB weatherDB;

    MyWeatherForecast(WeatherDB weatherDB){
        this.weatherDB = weatherDB;
    }

    public ClientResponse predictWeatherForClient(ClientRequest request) {
        return null;
    }
}
