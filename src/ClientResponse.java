public interface ClientResponse extends UserInfo {
    int getPredictedTemperature();
    int getPredictedHumidity();
    int getPredictedWind();
    String getLocation();
    Date getPredictedTime();
}
