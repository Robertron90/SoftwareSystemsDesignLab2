package Interactor.WeatherForecast;

import DB.Weather.WeatherDB;
import Entities.Requests.ClientRequest;
import Entities.Responses.ClientResponse;
import Memento.Memento;
import Memento.MyMemento;

public class MyWeatherForecast implements WeatherForecast {

    private WeatherDB weatherDB;

    private static MyWeatherForecast obj = new MyWeatherForecast();

    private MyWeatherForecast(){
    }

    public static MyWeatherForecast getInstance(WeatherDB weatherDB){
        if (obj.weatherDB == null) {
            obj.weatherDB = weatherDB;
        }
        return obj;
    }

    public ClientResponse predictWeatherForClient(ClientRequest request) {
        return null;
    }

    public void setState(WeatherDB state){
        this.weatherDB = state;
    }

    public Memento saveStateToMemento() {
        return new MyMemento(weatherDB);
    }

    public void getStateFromMemento(Memento memento){
        weatherDB = memento.getState();
    }
}
