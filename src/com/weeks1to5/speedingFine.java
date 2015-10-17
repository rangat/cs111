package com.weeks1to5;

import com.IO;

/**
 * Created by User on 10/2/2015.
 */
public class speedingFine {
    public static void main(String[] args){
        System.out.print("How fast were you going? ");
        int speed = IO.readInt();
        if(speed<=60){
            System.out.print("$0");
        }
        else if(speed<=75){
            System.out.print("$100");
        }
        else if(speed<=90){
            System.out.print("$200");
        }
        else if(speed>90){
            System.out.print("Damn you were going fast! $500 fine for you!");
        }
    }
}
