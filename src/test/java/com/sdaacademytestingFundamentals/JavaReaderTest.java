package com.sdaacademytestingFundamentals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class JavaReaderTest {
    @Test
    public void testRead(){
        JavaReader reader= mock(JavaReader.class);
       when(reader.read()).thenReturn("23");
       assertEquals("23",reader.read());
    }
@Test
    public void skipirst2CharsTest(){
    JavaReader reader= mock(JavaReader.class);
    when(reader.read()).thenReturn("233");
    assertEquals("3",reader.skipFirst2Chars());

    }




}
