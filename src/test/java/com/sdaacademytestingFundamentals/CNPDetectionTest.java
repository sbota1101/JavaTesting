package com.sdaacademytestingFundamentals;
import org.junit.Test;
import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class CNPDetectionTest {

    @Test
    public void detectGender(){
        CNPDetection cnpDetection = new CNPDetection("18412252356014");
        assertEquals("M", cnpDetection.getGender());
        cnpDetection = new CNPDetection("3841225235");
        assertEquals("M", cnpDetection.getGender());
        cnpDetection = new CNPDetection("5841225235");
        assertEquals("M", cnpDetection.getGender());
        cnpDetection = new CNPDetection("2841225235");
        assertEquals("F", cnpDetection.getGender());
        cnpDetection = new CNPDetection("4841225235");
        assertEquals("F", cnpDetection.getGender());
        cnpDetection = new CNPDetection("6841225235");
        assertEquals("F", cnpDetection.getGender());
    }
    @Test(expected = InvalidParameterException.class) //exception breaks the flow
    public void invalidFirstCharTest() {
        CNPDetection cnpDetection = new CNPDetection("F841225235");
        assertEquals("F", cnpDetection.getGender());
    }
    @Test(expected = InvalidParameterException.class)
    public void invalidCNPTest() {
        CNPDetection cnpDetection = new CNPDetection(null);
    }
    @Test
    public void dateTest(){
        CNPDetection cnpDetection = new CNPDetection("F841225235");
        assertThat(cnpDetection.getDate()).isAfter("1900-01-01").isBefore(String.valueOf(LocalDateTime.now()));
    }
    @Test
    public void ageTest(){
        CNPDetection cnpDetection = new CNPDetection("F841225235");
        assertEquals(35,cnpDetection.getAge());
    }
    @Test
    public void testgetLastDigit(){
        CNPDetection cnpDetection1=new CNPDetection("2910111205560");
        assertThat(cnpDetection1.getLastDigit())
                .isNotEmpty()
                .contains("0")
                .contains("6");

    }
}

