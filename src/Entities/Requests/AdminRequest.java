package Entities_Requests;

import Entities_others.UserInfo;
import java.util.Date;

public interface AdminRequest extends UserInfo {
    int getTemperatureToAdd();
    int getHumidityToAdd();
    int getWindToAdd();
    String getLocationToAdd();
    Date getTimeOfWeatherHappening();
}
