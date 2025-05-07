package ru.ivan.ver.temperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class TemperatureApplication {

    private static Random RND = new Random();
    private static long MIN_VAL = -5L;
    private static long MAX_VAL = 50L;
    @GetMapping
    public String getTemperature() {
        double result = MIN_VAL + RND.nextDouble() * (MAX_VAL - MIN_VAL);
        return String.format("%.2f", result);
    }

    public static void main(String[] args) {
        SpringApplication.run(TemperatureApplication.class, args);
    }

}
