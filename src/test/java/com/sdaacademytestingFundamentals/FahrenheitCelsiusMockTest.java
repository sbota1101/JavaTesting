package com.sdaacademytestingFundamentals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


//Mock FahrenheitCelciusConverter Class. Mocked up methods should print their names
//and exit


@RunWith(MockitoJUnitRunner.class)
public class FahrenheitCelsiusMockTest {
    @Test
    public void mockTestCelsius() {
        FahrenheitCelsius fah1 = mock(FahrenheitCelsius.class);

        when(fah1.celsius(100)).thenReturn(4.0);
        assertEquals("Celsius", fah1.celsius(100));
    }

    @Test
    public void mockTestFahrenheit() {
        FahrenheitCelsius fah = mock(FahrenheitCelsius.class);

         when(fah.fharenheit(100)).thenReturn(4.0);
         assertEquals("Fahrenheit", fah.fharenheit(100));
    }
}

