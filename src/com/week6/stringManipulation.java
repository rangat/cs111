package com.week6;

import com.IO;

/**
 * Created by User on 10/23/2015.
 */
public class stringManipulation {
    public static void main(String[] args){
        System.out.print("What is your string: ");
        String string = IO.readString();
        System.out.print(isPalindrome(string));
    }
    public static boolean isPalindrome(String s){
        boolean isTrue = true;
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");

        int j = s.length()-1;
        for(int i = 0; i < s.length(); i++){
            //System.out.println(j);
            char front = s.charAt(i);
            char back = s.charAt(j);
            if(front == back){
                isTrue = true;
            }
            else{
                return false;
            }
            j--;
        }
        return isTrue;
    }
}
