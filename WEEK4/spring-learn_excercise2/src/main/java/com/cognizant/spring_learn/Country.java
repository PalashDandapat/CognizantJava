package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    public static final Logger LOGGER= LoggerFactory.getLogger(Country.class);
    private String code,name;
    public Country(){
        LOGGER.debug("Entered Country Constructor");

    }
    public String getCode(){
        LOGGER.debug("GETTING COUNTRY CODE");
        return code;
    }
    public String getName(){
        LOGGER.debug("GETTING COUNTRY NAME");
        return name;
    }
    public void setCode(String code){
       LOGGER.debug("Setting Code");
        this.code=code;
    }
    public void setName(String name){
        LOGGER.debug("Setting Country NAME");
        this.name=name;
    }
    @Override
    public String toString(){
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
