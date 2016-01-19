package com.ekiras.service;

import org.springframework.stereotype.Service;

/**
 * @author ekansh
 * @since 20/1/16
 */
@Service
public class HomeService {

    public String home(){
        return "Hello World";
    }

    public String about(){
        return "Spring Boot Introduction";
    }


}
