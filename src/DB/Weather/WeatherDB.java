package DB.Weather;

import Entities.Requests.AdminRequest;
import Entities.Responses.AdminResponse;

import java.util.Date;
import java.util.Map;

public interface WeatherDB {
    AdminResponse addAdminWeather(AdminRequest request);
    Map<Integer, Date> getWindByTime();
    Map<Integer, Date> getHumidityByTime();
    Map<Integer, Date> getTemperatureByTime();
    Map<String, Date> getLocationByTime();
}
