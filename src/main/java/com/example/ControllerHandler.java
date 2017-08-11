package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/test/counter")
public class ControllerHandler{


    @RequestMapping(method = RequestMethod.GET)
    public String counter(HttpServletRequest request){
        String counter = request.getAttribute("visitorCount").toString();
        
        return "You are visitor number: "+counter;
    }
    
}