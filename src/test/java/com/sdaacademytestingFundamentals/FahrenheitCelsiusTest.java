package com.sdaacademytestingFundamentals;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


//Write at least two tests for every method

public class FahrenheitCelsiusTest {
    public FahrenheitCelsius fah;
    @Test
    public void testCelsius(){
         fah=new FahrenheitCelsius();
        double result=fah.celsius(100);
        assertEquals(result,37.777778);

    }

    @Test
    public void testFahrenheit(){
        fah=new FahrenheitCelsius();
        double c=fah.fharenheit(20);
        assertEquals(c,52.5555556);

    }

}
