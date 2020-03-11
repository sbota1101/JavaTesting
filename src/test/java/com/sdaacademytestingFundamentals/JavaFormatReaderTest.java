package com.sdaacademytestingFundamentals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class JavaFormatReaderTest {
    @Test
    public  void testRead()
    {
        JavaFormatReader reader = new JavaFormatReader();
        JavaReader readerMock = mock(JavaReader.class);
        when(readerMock.read()).thenReturn("233");
        reader.reader=readerMock;
        assertEquals("3",reader.readFormatted());
        assertThat(reader.readFormatted())
                .isNotBlank()
                .isNotEmpty()
                .contains("3");


    }
}
