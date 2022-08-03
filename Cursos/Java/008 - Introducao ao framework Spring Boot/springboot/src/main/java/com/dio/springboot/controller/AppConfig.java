package com.dio.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {

    /*@GetMapping("/")
    public String helloWorld(){
        return "Hello, World!";
    }*/

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "A seguinte variavel de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
