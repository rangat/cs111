package com.weeks1to5;

import com.IO;

/**
 * Created by User on 9/22/2015.
 */
public class Sphere {
    public static void main(String[] args){
        System.out.println("Radius of com.weeks1to5.Sphere: ");
        double radius = IO.readDouble();
        double volume;

        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.print(volume);
    }
}