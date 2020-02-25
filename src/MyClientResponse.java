import java.util.Date;

public class MyClientResponse implements ClientResponse{
    String userID;
    String userPassword;
    int temperature;
    int humidity, wind;
    String location;
    Date date;

    public MyClientResponse(String userID, String userPassword, int temperature, int humidity, int wind, String location, Date date) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.location = location;
        this.date = date;
    }

    public int getCurrentTemperature() {
        return temperature;
    }

    public int getCurrentHumidity() {
        return humidity;
    }

    public int getCurrentWind() {
        return wind;
    }

    public String getCurrentLocation() {
        return location;
    }

    public Date getPredictedTime(){return date}

    public String getID() {
        return userID;
    }

    public String getPassword() {
        return userPassword;
    }
}
