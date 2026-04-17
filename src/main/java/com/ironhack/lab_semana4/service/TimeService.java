package com.ironhack.lab_semana4.service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class TimeService {

    public String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.now().format(formatter);
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        return LocalDate.now().getDayOfWeek().toString().toLowerCase();
    }

}
