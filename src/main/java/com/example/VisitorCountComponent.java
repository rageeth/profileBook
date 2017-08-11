package com.example;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component
@Data
@Slf4j
public class VisitorCountComponent {

    private int count;
    
    
    @PostConstruct
    public void init(){
        log.info("count is::"+count);
        count++;
    }
    
}
