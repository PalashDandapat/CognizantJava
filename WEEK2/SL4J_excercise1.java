package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SL4J_excercise1 {
    public static void main(String args[]){
        Logger logger= LoggerFactory.getLogger("excercise1");
        logger.error("Found some Error ");
        logger.warn("Found some WARINGINGS");
    }
}
