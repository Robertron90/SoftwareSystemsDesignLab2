package Others;

import Entities.Requests.ClientRequest;
import Entities.Responses.ClientResponse;

public interface WeatherForecast {
    ClientResponse predictWeatherForClient(ClientRequest request);
}
