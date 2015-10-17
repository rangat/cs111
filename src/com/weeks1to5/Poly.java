package com.weeks1to5;

import com.IO;

/**
 * Created by User on 9/23/2015.
 */
public class Poly {
    public static void main(String[] args){
        System.out.println("Enter the first root: ");
        int x = IO.readInt();
        System.out.println("Enter the second root: ");
        int y = IO.readInt();
        System.out.println("Enter the third root: ");
        int z = IO.readInt();
        int a = -(x + y + z);
        int b = (z*y + z*x + x*y);
        int c = -(x*y*z);

        String sign1 = "";
        String sign2 = "";
        String sign3 = "";

        if(a>=0){
            sign1 = "+";
        }
        if(b>=0){
            sign2 = "+";
        }
        if(c>=0){
            sign3 = "+";
        }
        System.out.format("The Polynomial Form is %n" + "x^3" + sign1 + a + "x^2" + sign2 + b +"x" + sign3 + c);
    }
}