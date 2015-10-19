package com.week6;
import com.IO;

/**
 * Created by User on 10/17/2015.
 */
public class TwoSmallest {
    public static void main(String[] args){
        System.out.print("Enter terminating number: ");
        double term = IO.readDouble();
        double min1 = 0;
        double min2 = 0;
        int counter = 0;
        min1 = Double.MAX_VALUE;
        min2 = Double.MIN_VALUE;
        while(counter <2){
            System.out.println("Enter numbers: ");
            double number = IO.readDouble();

            while(number != term){
                if(number<min1){
                    min2 = min1;
                    min1 = number;
                }
                else if(number>=min1 && number<min2){
                    min2 = number;
                }
                counter++;
                number = IO.readDouble();
            }
            if(counter<2){
                IO.reportBadInput();
            }
        }

        System.out.println("--TERMINATED--");
        IO.outputDoubleAnswer(min1);
        IO.outputDoubleAnswer(min2);
    }
}
