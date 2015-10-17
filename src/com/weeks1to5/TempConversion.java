package com.weeks1to5;

import com.IO;

public class TempConversion{
    public static void main (String[] args){
        System.out.println("Enter Temperature in Fahrenheit: ");
        double fahrenheit = IO.readDouble();
        double celsius;
        celsius = (5.0/9.0) * (fahrenheit - 32);
        System.out.println(celsius);
    }
}