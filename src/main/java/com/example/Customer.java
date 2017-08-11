package com.example;

import lombok.Data;

@Data
public class Customer {
    
 private String name;
 
 private Car car;
 
 public Customer(String name){
     this.name = name;
     CarFactory carFactory = new CarFactory();
     
     this.car = carFactory.getCar(name);
 }
 
}
