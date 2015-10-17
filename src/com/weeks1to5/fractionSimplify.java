package com.weeks1to5;

import com.IO;

/**
 * Created by User on 10/16/2015.
 */
public class fractionSimplify {
    public static void main(String[] args){
        System.out.print("What is your numerator? ");
        int num = IO.readInt();
        System.out.print("What is your denominator? ");
        int denom = IO.readInt();
        int factor = GCF.find(num, denom);
        System.out.print((num/factor) + "/" + (denom/factor));
    }
}
