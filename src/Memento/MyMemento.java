package Memento;

import DB.Weather.WeatherDB;

public class MyMemento implements Memento {
    private WeatherDB state;

    public MyMemento(WeatherDB state){
        this.state = state;
    }

    public WeatherDB getState() {
        return state;
    }
}
