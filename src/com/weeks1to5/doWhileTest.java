package com.weeks1to5;

/**
 * Created by User on 10/12/2015.
 */
public class doWhileTest {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int test = 5;
        while(x<test){
            System.out.println(x);
            x++;
        }
        do{
            System.out.println("\t"+y);
            y++;
        }while(y<test);
    }
}
