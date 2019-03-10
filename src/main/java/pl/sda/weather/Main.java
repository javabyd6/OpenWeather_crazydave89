package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void getWeather(String city){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Weather weather=objectMapper.readValue(new URL("http://api.apixu.com/v1/current.json?key=6219ff788aa942b2aef115716191003&q="+city),Weather.class);
            System.out.println(weather.getLocation().getName());
            System.out.println(weather.getLocation().getLocaltime());
            System.out.println(weather.getCurrent().getTemp_c()+" stopni C");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getWeather("Paris");
    }
}
