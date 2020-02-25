public interface WeatherForecast {
    WeatherDB weatherDB;
    ClientResponse predictWeatherForClient(ClientRequest request);
}
