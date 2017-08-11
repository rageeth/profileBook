package com.example;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Audi implements Car {
    
 private final String name ="Audi";
 
 public String getEngineVolume(){
     return "2.0 T";
 }
 
 public String getBrand(){
     return name;
 }
 
}
