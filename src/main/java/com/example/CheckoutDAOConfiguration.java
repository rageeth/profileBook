package com.example;

import java.util.List;
import java.util.SortedSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CheckoutDAOConfiguration {


    @Value(value = "${test}")
    private String ymlStringValue;
    
    @Value("#{'${test}'.split(',')}")
    private List<String> ymlListValue;
    
    @Value("#{'${test}'.split(',')}")
    private SortedSet<String> ymlSetValue;

    /**
     * This method constructs, populates, and returns an DAOProperties object.
     *
     * @return DAOProperties
     */
    @Bean
    public String populateDefaultValue() {
        System.out.println("ymlVAlue is::"+ymlStringValue);
        System.out.println("ymlListValue is::"+ymlListValue);

        System.out.println("ymlSetValue is::"+ymlSetValue);
        
        for(String setValue: ymlSetValue){
            System.out.println(setValue);
            System.out.println("nn");

        }

        return ymlStringValue;
    }
    
    @Bean
    
    public String testLogging(){
        log.info("This is a test log...********************");
        return "test";
    }

}