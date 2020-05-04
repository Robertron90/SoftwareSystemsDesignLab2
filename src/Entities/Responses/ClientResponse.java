package Entities.Responses;

import Entities.UserInfo.UserInfo;

import java.util.Date;

public interface ClientResponse extends UserInfo {
    int getPredictedTemperature();
    int getPredictedHumidity();
    int getPredictedWind();
    String getLocation();
    Date getPredictedTime();
}
