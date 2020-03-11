package com.sdaacademytestingFundamentals;

public class JavaFormatReader {
    public JavaReader reader=new JavaReader();
    public String readFormatted(){
        return reader.read().substring(2);
    }
}
