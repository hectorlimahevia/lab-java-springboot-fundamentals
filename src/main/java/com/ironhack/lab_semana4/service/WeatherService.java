package com.ironhack.lab_semana4.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    //Metodo para la temperatura
    public int getCurrentTemperature(){
        return random.nextInt(51) - 10;
    }

    //Metodo para el estado del clima
    public String getWeatherCondition(){
        String[] conditions = {"Sunny", "Cloudy", "Rainy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    //Metodo para la velocidad del viento
    public int getWinSpeed() {
        return random.nextInt(121);
    }
}
