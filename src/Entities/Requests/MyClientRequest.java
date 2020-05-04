package Entities.Requests;

import Factories.FlyweightLocationFactory;
import Entities.FlyweightLocation;

import java.util.Date;

public class MyClientRequest implements ClientRequest{

    private String userID;
    private String userPassword;
    private int currentTemp, currentHumidity, currentWind;
    private Date predictionTime;
    private FlyweightLocation flyweightLocation;
    private FlyweightLocationFactory flyweightLocationFactory;

    public MyClientRequest(String userID, String userPassword, int currentTemp, int currentHumidity, int currentWind, String currentLocation, Date predictionTime) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.currentTemp = currentTemp;
        this.currentHumidity = currentHumidity;
        this.currentWind = currentWind;
        this.predictionTime = predictionTime;
        flyweightLocationFactory = FlyweightLocationFactory.getInstance();
        flyweightLocation = flyweightLocationFactory.getFlywayLocation(currentLocation);
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
        return  flyweightLocation.getLocation();
    }
    public Date getPredictionTime(){return predictionTime; }
}
