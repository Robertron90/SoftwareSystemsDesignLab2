package Memento;

import DB.Weather.WeatherDB;

public interface Memento {
    public WeatherDB getState();
}
