package Entities.Requests;

import Entities.UserInfo.UserInfo;

import java.util.Date;

public interface ClientRequest extends UserInfo {
    int getCurrentTemperature();
    int getCurrentHumidity();
    int getCurrentWind();
    String getCurrentLocation();
    Date getPredictionTime();
}
