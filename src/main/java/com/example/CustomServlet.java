package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class CustomServlet extends DispatcherServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 3521117497456844171L;

    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("***Inside custom servlet***");
        request.setAttribute("customServlet", "true");
    }
}
