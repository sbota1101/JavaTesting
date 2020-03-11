package com.sdaacademytestingFundamentals;

public class FahrenheitCelsius {
//Create FahrenheitCelciusConverter Class. It should contain two methods
//a)toCelcius int fahrenheit
//b)toFahrenheit int celcius

  public double celsius(int f){
      double c=(f-32)*(5/9);
      return c;
  }


    public double fharenheit(int c){
        double f =(c*5/9)+32;
        return f;
    }

}
