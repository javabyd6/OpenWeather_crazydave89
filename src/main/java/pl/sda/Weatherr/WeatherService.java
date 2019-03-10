package pl.sda.Weatherr;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.weather.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


@NoArgsConstructor
@Data
public class WeatherService {


    private String finalURL;

    public WeatherService(String urlAddress, String api) {
        this.finalURL = urlAddress+api;
    }

    public Weather getCityWeather(String city)  {
            String finalURL = getFinalURL()+city;
            ObjectMapper mapper = new ObjectMapper();
        Weather weather = null;
        try {
            weather = mapper.readValue(finalURL, Weather.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }
}
