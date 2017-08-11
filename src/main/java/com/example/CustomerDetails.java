package com.example;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "Response")
public class CustomerDetails {

    private String name;
    private String carBrand;
    private String carEngineVolume;
    private String carNumberofWheels;
    private String visitorCount;

}
