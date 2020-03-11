package com.sdaacademytestingFundamentals;

public class Calculator {
    //se creaza 2 metode add(intx,int y) si sub(int x,int y)
    public int add(int x,int y){
        long result=(long)x+y;
        //Think about more functional tests for Calculator Class what will happen ,
        //if both Integer values will contain maximum values Integer.MAX_VALUE-o sa ne dea o eroare
        // si at ca sa ne asig ca o dea o exceptie folosim in test @Rule
        if(result>Integer.MAX_VALUE){
            throw new ArithmeticException("Ana are mere");
        }
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
}
