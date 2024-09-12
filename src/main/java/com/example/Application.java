package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        System.out.println("The verysimple program started \n this is message from me to me \n It worked \n Good boy Jenkins");
    }
}