package com.example;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "Response")
public class TestObject {

    private String name;
    private String greetings;
    private String timeNow;
    private String customerCount;

}
