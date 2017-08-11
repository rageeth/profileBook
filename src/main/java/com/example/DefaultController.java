package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/")
public class DefaultController {


    @RequestMapping(method = RequestMethod.GET)
    public String defaultController(HttpServletRequest request){
        return "Welcome to Test App";
    }
    
    
}