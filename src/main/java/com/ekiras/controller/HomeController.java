package com.ekiras.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekansh
 * @since 19/1/16
 */
@RestController
@RequestMapping("")
public class HomeController {

    @RequestMapping({"","/","/home"})
    public String home(){
        return "Hello World";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return "Spring Boot Introduction";
    }
    
}
