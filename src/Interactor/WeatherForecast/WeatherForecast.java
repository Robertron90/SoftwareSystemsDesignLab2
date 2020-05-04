package Interactor.WeatherForecast;

import DB.Weather.WeatherDB;
import Entities.Requests.ClientRequest;
import Entities.Responses.ClientResponse;
import Memento.Memento;

public interface WeatherForecast {
    ClientResponse predictWeatherForClient(ClientRequest request);
    void setState(WeatherDB state);
    void getStateFromMemento(Memento memento);
    Memento saveStateToMemento();
}
