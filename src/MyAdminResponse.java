import java.util.Date;

public class MyAdminResponse implements AdminResponse {

    String userID;
    String userPassword;
    int temperature;
    int humidity, wind;
    String location;
    Date date;

    public MyAdminResponse(String userID, String userPassword, int temperature, int humidity, int wind, String location, Date date) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.location = location;
        this.date = date;
    }

    public int getAddedTemperature() {
        return temperature;
    }

    public int getAddedHumidity() {
        return humidity;
    }

    public int getAddedWind() {
        return wind;
    }

    public String getAddedLocation() {
        return location;
    }

    public Date getAddedTimeOfWeatherHappening() {
        return date;
    }

    public String getID() {
        return userID;
    }

    public String getPassword() {
        return userPassword;
    }
}
