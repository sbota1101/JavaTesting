package com.sdaacademytestingFundamentals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockTest {
    @Test
    public void add(){
        Calculator calcMock=mock(Calculator.class);
        when(calcMock.add(1,3)).thenReturn(8);
        assertEquals(8,calcMock.add(1,3));
    }
    @Test
    public void sub(){
        Calculator calcMock=mock(Calculator.class);
        when(calcMock.sub(4,1)).thenReturn(3);
        assertEquals(3,calcMock.sub(4,1));
    }
}
