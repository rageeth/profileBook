package com.example;

import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {


    @Autowired
    VisitorCountComponent visitorCount;
    
    String classpath = System.getProperty("java.class.path");
    
    @RequestMapping(value = "/firstapp", produces = {"application/json" }, method = RequestMethod.GET)
    public String populateDefaultValue(
            @RequestHeader(name = "Accept", required = false) String acceptHeader,@RequestParam(name = "name", required = false) String nameParameter,HttpServletRequest request) {

        log.info("INFO log*****************");
        log.error("ERROR log***************");
        log.warn("WARN log******************");
        log.debug("DEBUG log**************");
        
        log.info("CLASSPATH is::::"+classpath);
        
        Customer customer1 = new Customer("rageeth");
        
        
        
        
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setName(customer1.getName());
        customerDetails.setCarBrand(customer1.getCar().getBrand());
        customerDetails.setCarEngineVolume(customer1.getCar().getEngineVolume());
        customerDetails.setCarNumberofWheels(new Integer(Car.numberOfWheels).toString());
        customerDetails.setVisitorCount(request.getAttribute("visitorCount").toString());


        if(acceptHeader.equalsIgnoreCase("application/xml")){
            try {
                JAXBContext jaxB = JAXBContext.newInstance(CustomerDetails.class);
                Marshaller marshaller = jaxB.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

                StringWriter sw = new StringWriter();
                marshaller.marshal(customerDetails, sw);
                return sw.toString();
                
            } catch (JAXBException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }else{

            
            ObjectMapper objectMapper = new ObjectMapper();
            
            try {
                return objectMapper.writeValueAsString(customerDetails);
            } catch (JsonProcessingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        return "Sorry, The application is experiencing technical difficulties. Please try again later";
    }
    
}