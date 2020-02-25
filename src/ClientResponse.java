public interface ClientResponse extends UserInfo {
    int getCurrentTemperature();
    int getCurrentHumidity();
    int getCurrentWind();
    String getCurrentLocation();
}
