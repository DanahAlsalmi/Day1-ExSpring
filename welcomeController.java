package com.example.day1exspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name(){
        return "My name is Danah Alsalmi";
    }
    @GetMapping("/age")
    public String age(){
        return "My age is 24";
    }
    @GetMapping("/check/status")
    public String check(){
        return "Everything is OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] names(){
        String[]names={"danah","naif","sara"};
        return names;
    }

}
