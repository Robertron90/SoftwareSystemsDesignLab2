import java.util.Date;

public class MyAdminRequest implements AdminRequest {
    String userID;
    String userPassword;
    int temperature;
    int humidity, wind;
    String location;
    Date date;

    public MyAdminRequest(String userID, String userPassword, int temperature, int humidity, int wind, String location, Date date) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.location = location;
        this.date = date;
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
    public String getLocationToAdd(){
        return location;
    }
    public Date getTimeOfWeatherHappening(){
        return date;
    }


}
