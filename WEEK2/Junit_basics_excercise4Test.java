package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Junit_basics_excercise4Test {
    Junit_basics_excercise4 calculate;
    @Before
    public void cr(){
        System.out.println("OBJECT CREATION");
        calculate=new Junit_basics_excercise4();
    }
    @After
    public void af(){

        System.out.println("OBJECT UNITILASING");
        calculate=null;
    }
    @Test
    public void addtest(){
        //A-Arrange
        int a=10;
        int b=20;
        //A-Act
        int result= calculate.add(a,b);
        //A-assert
        assertEquals(30,result);
    }
    @Test
    public void substract(){
        //A-Arrange
        int a=20;
        int b=10;
        //A-Act
        int result= calculate.substract(a,b);
        //A-assert
        assertEquals(10,result);
    }

}