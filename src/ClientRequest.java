public interface ClientRequest extends UserInfo {
    int getCurrentTemperature();
    int getCurrentHumidity();
    int getCurrentWind();
    String getCurrentLocation();
    Date getPredictionTime():
}
