package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class DispatcherServletConfiguration{

    @Autowired
    RequestMappingHandlerMapping requestMappingHandlerMapping;
    
    public void getcustomUrlHandlerMapping(){
        ControllerHandler controllerHandler =  new ControllerHandler();

        PatternsRequestCondition pathPatternsCondition = new PatternsRequestCondition("/test/counter");
        
        RequestMappingInfo requestMappingInfo = new RequestMappingInfo("/test/counter",pathPatternsCondition,null,null,null,null,null,null);
        
        try {
            requestMappingHandlerMapping.registerMapping(requestMappingInfo, controllerHandler, ControllerHandler.class.getDeclaredMethod("counter", HttpServletRequest.class));
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
      
    }
    

    
}
