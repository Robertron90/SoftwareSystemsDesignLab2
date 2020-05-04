package Entities.Requests;

import Entities.UserInfo.UserInfo;
import java.util.Date;

public interface AdminRequest extends UserInfo {
    int getTemperatureToAdd();
    int getHumidityToAdd();
    int getWindToAdd();
    String getLocationToAdd();
    Date getTimeOfWeatherHappening();
}
