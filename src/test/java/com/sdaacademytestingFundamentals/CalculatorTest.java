package com.sdaacademytestingFundamentals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.xml.ws.soap.Addressing;

import static org.junit.Assert.*;
public class CalculatorTest {
    public Calculator calculator;

    @Before
    public void instantiateClass(){
    System.out.println("Instantiate");
         calculator = new Calculator();

    }
    @After
    public void cleanClass() {
        System.out.println("Clean");
        calculator = null;
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    //suma sa fie adevarata
    @Test
    public void testAdd() {
        int result = calculator.add(3,1);
        assertEquals("A crapat",result,4);

    }
    //diferenta sa fie adevarata
    @Test
    public void testSub(){
        int result=calculator.sub(4,1);
        assertEquals(result,3);
    }
    //ne ast sa dea o exceptie si at punem la test...aritmetic exception si at trece testul.
    @Test
    public void testAddInvalid() {
       expectedException.expect(ArithmeticException.class);
       expectedException.expectMessage("Ana are mere!");
        int result = calculator.add(Integer.MAX_VALUE, 3);

       // assert result==2; ori cu asta ori fara...noi vrem sa dea o exceptie

    }



}
