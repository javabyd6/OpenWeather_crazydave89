package pl.sda.weather;

import pl.sda.Weatherr.WeatherService;

import java.net.MalformedURLException;

public class Main {


    public static void main(String[] args) throws MalformedURLException {
        WeatherService weatherService = new WeatherService();
        System.out.println(weatherService.getCityWeather("Bydgoszcz").getLocation().getName());
    }
}
