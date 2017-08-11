package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class VisitorCountHandlerInterceptor extends HandlerInterceptorAdapter {
    
    private static int count=0;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        count++;
        Object handlertemp = handler;
        System.out.println("Inside VisitorCountHandlerInterceptor...");
        request.setAttribute("visitorCount", count);
        return true;
    }

}
