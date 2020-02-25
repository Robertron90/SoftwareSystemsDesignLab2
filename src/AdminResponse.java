import java.util.Date;

public interface AdminResponse extends UserInfo{

    int getAddedTemperature();
    int getAddedHumidity();
    int getAddedWind();
    String getAddedLocation();
    Date getAddedTimeOfWeatherHappening();
}
