package com.example;

import org.springframework.stereotype.Component;

@Component
public class AudiCarFactory extends CarFactory {
    
 public Car getCar(String name){
     return new Audi();
 };
 
 
}
