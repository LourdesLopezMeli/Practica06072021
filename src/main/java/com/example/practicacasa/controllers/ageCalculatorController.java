package com.example.practicacasa.controllers;

import com.example.practicacasa.handlers.AgeHandler;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/age")
public class ageCalculatorController {

    @GetMapping("/calculate-age/{dayDate}/{monthDate}/{yearDate}")
    public int calculateAge(@PathVariable() int dayDate, @PathVariable() int monthDate, @PathVariable() int yearDate) {
        return AgeHandler.calculateAge(dayDate, monthDate, yearDate);
    }

}
