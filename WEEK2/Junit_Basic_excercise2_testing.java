package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Junit_Basic_excercise2_testing {

    @Test
    public void testSq() {
        Junit_Basic_excercise2_method sq1=new Junit_Basic_excercise2_method();
        assertEquals(4, sq1.sq(2));
    }

    @Test
    public void testTestSq() {
        Junit_Basic_excercise2_method sq1=new Junit_Basic_excercise2_method();
        assertEquals(4.0, sq1.sq(2.0),0.1);
    }
}