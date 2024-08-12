package cz.krupicka.SpringWeatherApi.dto;

public class WeatherApiDto {
    private Location location;
    private Current current;

    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
    }
}


