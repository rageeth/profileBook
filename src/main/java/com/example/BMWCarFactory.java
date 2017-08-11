package com.example;

import org.springframework.stereotype.Component;

@Component
public class BMWCarFactory extends CarFactory{
    
 public Car getCar(String name){
     return new BMW();   
 }
 
 
}
