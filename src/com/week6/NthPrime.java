package com.week6;
import com.IO;

/**
 * Created by User on 10/19/2015.
 */
public class NthPrime{
    public static void main(String []args){
        int input = 0;
        while (input<=0){
            System.out.print("Which prime do you want? ");
            input = IO.readInt();
            if(input>0){
                int counter=0;
                int temp = 0;
                for(int x=2;x<=input*10;x++){
                    for(int y=2;y<=x;y++){
                        if(x==y){
                            counter++;
                            temp = x;
                        }
                        if(x%y==0){
                            break;
                        }
                    }
                    if(counter==input){
                        break;
                    }
                }
                IO.outputIntAnswer(temp);
            }
            else{
                IO.reportBadInput();
            }
        }
    }
}