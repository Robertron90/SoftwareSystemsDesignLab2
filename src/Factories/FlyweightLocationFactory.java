package Entities.Factories;

import Entities.Others.FlyweightLocation;

import java.util.HashMap;
import java.util.Map;

public class FlyweightLocationFactory {
    private Map<String, FlyweightLocation> locations;
    private static FlyweightLocationFactory obj = new FlyweightLocationFactory();

    private FlyweightLocationFactory(){
        locations = new HashMap<>();
    }
    public FlyweightLocation getFlywayLocation(String location) {
        if (locations.get(location) == null){
            locations.put(location, new FlyweightLocation(location));
        }
        return locations.get(location);
    }
    public static FlyweightLocationFactory getInstance(){
        return obj;
    }
}
