package com.ekiras.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ekansh
 * @since 20/1/16
 */
@RestController
@RequestMapping("")
public class DemoController {

    @RequestMapping("/d1/{version}")
    public String url(@PathVariable("version")String version){
        return version;
    }

    @RequestMapping("/d2")
    public String request(@RequestParam("version")String version){
        return version;
    }

    @RequestMapping("/d3")
    public String body(@RequestBody String version){
        return version;
    }
    

}
