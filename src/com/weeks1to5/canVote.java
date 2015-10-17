package com.weeks1to5;

import com.IO;

/**
 * Created by User on 10/2/2015.
 */
public class canVote {
    public static void main (String[] args){
        System.out.print("How old are you?");
        int age = IO.readInt();
        if(age>=18){
            System.out.print("You can vote!");
        }
        else{
            System.out.print("You cant vote :(");
        }
    }
}
