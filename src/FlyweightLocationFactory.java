import java.util.HashMap;
import java.util.Map;

public class FlywayLocationFactory {
    private Map<String, FlyweightLocation> locations;
    private static FlywayLocationFactory obj = new FlywayLocationFactory();

    private FlywayLocationFactory(){
        locations = new HashMap<>();
    }
    public FlyweightLocation getFlywayLocation(String location) {
        if (locations.get(location) == null){
            locations.put(location, new FlyweightLocation(location));
        }
        return locations.get(location);
    }
    public static FlywayLocationFactory getInstance(){
        return obj;
    }
}
