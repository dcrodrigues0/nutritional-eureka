package com.br.nutrition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @GetMapping("/status")
    public String isDockerRunning(){
        return "This server is running successfuly";
    }

}
