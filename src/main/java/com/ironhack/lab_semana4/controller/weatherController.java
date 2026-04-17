package com.ironhack.lab_semana4.controller;

import com.ironhack.lab_semana4.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherController {

    private final WeatherService weatherService;

    public weatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/temperature")
    public String getCurrentTemperature(){
        return "Current temperature: " + weatherService.getCurrentTemperature() + "°C";
    }

    @GetMapping("/weather/condition")
    public String getWeatherCondition(){
        return "Current weather condition: " + weatherService.getWeatherCondition();
    }

    @GetMapping("/weather/windspeed")
    public String getWindSpeed(){
        return "Current wind speed: " + weatherService.getWinSpeed() + " km/h";
    }

    @GetMapping("/weather/all")
    public String getAllWeather(){
        return "Temperature: " + getCurrentTemperature() + "°C, "
                + "Weather condition: " + getWeatherCondition() + ", "
                + "Wind speed: " + getWindSpeed() + " km/h";
    }
}
