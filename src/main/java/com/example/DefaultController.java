package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class DefaultController {


    @RequestMapping(method = RequestMethod.GET)
    public String defaultController(@RequestParam(value="name", required=false, defaultValue="") String name, Model model,HttpServletRequest httpRequest){
        model.addAttribute("name", name);
        return "index";
    }
    
    
}