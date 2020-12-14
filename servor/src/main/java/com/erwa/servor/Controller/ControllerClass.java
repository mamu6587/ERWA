package com.erwa.servor.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @RequestMapping("/")
    public String message(){
    return "TestMessage";
    }

}
