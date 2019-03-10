package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.Weatherr.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        System.out.println(weatherService.getCityWeather("Bydgoszcz").getLocation().getName());
    }
}
