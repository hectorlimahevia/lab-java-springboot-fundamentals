package com.ironhack.lab_semana4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    //Creando endpoint /hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }

    //Creando Endpoint/hello/{name}
    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    //Creando Endpoint/add/{num1}/{num2}
    @GetMapping("/add/{num1}/{num2}")
    public int addNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    //Creando Endpoint/multiply/{num1}/{num2}
    @GetMapping("/multiply/{num1}/{num2}")
    public int multiplyNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

}
