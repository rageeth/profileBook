package com.example;

import lombok.Data;

@Data
public class BMW implements Car{
    
    private final String name ="BMW"; 
    
    public String getEngineVolume(){
        return "2.0 i";
    }

    public String getBrand(){
        return name;
    }
	
}
