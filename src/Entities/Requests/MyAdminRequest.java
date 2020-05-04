package Entities.Requests;

import Factories.FlyweightLocationFactory;
import Entities.FlyweightLocation;

import java.util.Date;

public class MyAdminRequest implements AdminRequest {
    private String userID;
    private String userPassword;
    private int temperature;
    private int humidity, wind;
    private Date date;
    private FlyweightLocation flyweightLocation;
    private FlyweightLocationFactory flyweightLocationFactory;

    public MyAdminRequest(String userID, String userPassword, int temperature, int humidity, int wind, String location, Date date) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.date = date;
        flyweightLocationFactory = FlyweightLocationFactory.getInstance();
        flyweightLocation = flyweightLocationFactory.getFlywayLocation(location);
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

    public int getTemperatureToAdd(){
        return temperature;
    }
    public int getHumidityToAdd(){
        return humidity;
    }
    public int getWindToAdd(){
        return  wind;
    }
    public String getLocationToAdd(){ return flyweightLocation.getLocation(); }
    public Date getTimeOfWeatherHappening(){
        return date;
    }


}
