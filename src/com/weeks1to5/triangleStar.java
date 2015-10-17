package com.weeks1to5;

import com.IO;

/**
 * Created by User on 10/9/2015.
 */
public class triangleStar {
    public static void main(String[] args){
        System.out.print("What is the height of the triangle you want? ");
        int height = IO.readInt();
        int width = height+(height-1);
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= ((2 * i) - 1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
