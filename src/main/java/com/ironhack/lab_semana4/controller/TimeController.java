package com.ironhack.lab_semana4.controller;

import com.ironhack.lab_semana4.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;
//Controlador para el servicio de tiempo
    public TimeController(TimeService timeService){
        this.timeService = timeService;
        }

    @GetMapping("/time")
    public String getCurrentTime() {
        return timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getCurrentDate() {
        System.out.println("Endpoint /time llamado");
        return timeService.getCurrentDate();
    }

    @GetMapping("/dateofweek")
    public String getDayOfWeek() {
        return timeService.getDayOfWeek();
    }
}
