package Entities.Responses;

import Factories.FlyweightLocationFactory;
import Entities.FlyweightLocation;

import java.util.Date;

public class MyClientResponse implements ClientResponse{
    private String userID;
    private String userPassword;
    private int temperature;
    private int humidity, wind;
    private Date date;
    private FlyweightLocation flyweightLocation;
    private FlyweightLocationFactory flyweightLocationFactory;

    public MyClientResponse(String userID, String userPassword, int temperature, int humidity, int wind, String location, Date date) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.date = date;
        flyweightLocationFactory = FlyweightLocationFactory.getInstance();
        flyweightLocation = flyweightLocationFactory.getFlywayLocation(location);
    }

    public int getPredictedTemperature() {
        return temperature;
    }

    public int getPredictedHumidity() {
        return humidity;
    }

    public int getPredictedWind() {
        return wind;
    }

    public String getLocation() { return flyweightLocation.getLocation(); }

    public Date getPredictedTime() { return date; }

    public String getID() {
        return userID;
    }

    public String getPassword() { return userPassword; }
}
