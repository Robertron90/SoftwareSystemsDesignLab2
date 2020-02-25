public class MyClientRequest implements ClientRequest{

    String userID;
    String userPassword;
    int currentTemp, currentHumidity, currentWind;
    String currentLocation;

    public MyClientRequest(String userID, String userPassword, int currentTemp, int currentHumidity, int currentWind, String currentLocation) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.currentTemp = currentTemp;
        this.currentHumidity = currentHumidity;
        this.currentWind = currentWind;
        this.currentLocation = currentLocation;
    }

    public String getID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getCurrentTemperature(){
        return currentTemp;
    }
    public int getCurrentHumidity(){
        return currentHumidity;
    }
    public int getCurrentWind(){
        return currentWind;
    }
    public String getCurrentLocation(){
        return  currentLocation;
    }
}
