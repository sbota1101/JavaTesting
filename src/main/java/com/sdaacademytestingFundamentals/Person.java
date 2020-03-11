package com.sdaacademytestingFundamentals;

public class Person {
    private int age;
    public Person(int age){
        this.age=age;
    }
    public boolean isTeenager(){
        return age>10&&age<20;
    }
}
