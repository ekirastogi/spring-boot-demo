package com.ekiras.controller;

import com.ekiras.exception.CustomException1;
import com.ekiras.exception.CustomException2;
import com.ekiras.service.HomeService;
import com.ekiras.util.EnvConfig;
import com.ekiras.util.SampleConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    @Autowired private SampleConfig config;
    @Autowired private EnvConfig envConfig;


    @RequestMapping({"","/","/home"})
    public String home(){
        return homeService.home();
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return homeService.about();
    }

    @RequestMapping("/prop1")
    public String p1(){
        return config.getData1();
    }

    @RequestMapping("/prop2")
    public String p2(){
        return config.getData2();
    }

    @RequestMapping("/prop3")
    public String p3(){
        return config.getData3();
    }

    @RequestMapping("/env")
    public String env(){
        return envConfig.getEnv();
    }

    @RequestMapping("/e1")
    public String e1(){
        throw new CustomException1();
    }

    @RequestMapping("/e2")
    public String e2(){
        throw new CustomException2();
    }


    @ExceptionHandler(value = {CustomException1.class})
    public String handle(CustomException1 customException1){
        return customException1.getMessage();
    }





}
