package pl.sda.Weatherr;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.weather.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


@NoArgsConstructor
@Data
public class WeatherService {


    private String finalURL="http://api.apixu.com/v1/current.json?key=6219ff788aa942b2aef115716191003&q=";


    public Weather getCityWeather(String city) throws MalformedURLException {
            String finalURL = getFinalURL()+city;
        URL url = new URL(finalURL);
            ObjectMapper mapper = new ObjectMapper();
        Weather weather = null;
        try {
            weather = mapper.readValue(url, Weather.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }
}
