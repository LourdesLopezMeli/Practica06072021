package com.example.practicacasa.handlers;

import java.time.LocalDate;
import java.time.Period;


public class AgeHandler {

    public static int calculateAge(int dayDate, int monthDate, int yearDate) {
        LocalDate todayDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(yearDate, monthDate, dayDate);

        Period period = Period.between(birthDate, todayDate);

        return period.getYears();
    }
}
