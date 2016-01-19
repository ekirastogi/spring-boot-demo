package com.ekiras.controller;

import com.ekiras.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired private HomeService homeService;

    @RequestMapping({"","/","/home"})
    public String home(){
        return homeService.home();
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return homeService.about();
    }




}
