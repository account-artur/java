package com.health.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.*;

@RestController
public class HomePage {

    @RequestMapping("/")
    public String index(){
        return "Hello Hello 333";
    }

}
