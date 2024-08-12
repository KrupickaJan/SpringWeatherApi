package cz.krupicka.SpringWeatherApi.service;

import cz.krupicka.SpringWeatherApi.City;
import cz.krupicka.SpringWeatherApi.connector.WeatherApiConnector;
import cz.krupicka.SpringWeatherApi.dto.WeatherApiDto;
import cz.krupicka.SpringWeatherApi.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherDto getWeatherForCity(City cityEnum){
        WeatherApiConnector connector = new WeatherApiConnector();
        return transformDto(connector.getWeatherForCity(cityEnum));
    }

    private WeatherDto transformDto(WeatherApiDto apiDto){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setWeather_description(apiDto.getCurrent().getCondition().getText());
        weatherDto.setLocation(apiDto.getLocation().getName());
        weatherDto.setTimestamp(apiDto.getCurrent().getLast_updated());
        weatherDto.setTemp_celsius(apiDto.getCurrent().getTemp_c());
        weatherDto.setWind_direction(apiDto.getCurrent().getWind_dir());
        weatherDto.setRelative_humidity(apiDto.getCurrent().getHumidity());
        weatherDto.setWind_speed_m_per_s(apiDto.getCurrent().getWind_kph()/3.6);
        return weatherDto;
    }
}
