import java.util.Date;

public interface AdminRequest extends UserInfo{
    int getTemperatureToAdd();
    int getHumidityToAdd();
    int getWindToAdd();
    String getLocationToAdd();
    Date getTimeOfWeatherHappening();


}
