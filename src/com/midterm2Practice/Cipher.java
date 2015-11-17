package com.midterm2Practice;

/**
 * Created by User on 11/16/2015.
 */

/**
 * Each letter is decoded using the letter immediately preceding it in the alphabet. "b" becomes "a", "c" becomes "b", etc.
 * Each digit is decoded using the preceding digit. "1" becomes "0", "2" becomes "1", etc.
 * The digit "0" becomes "9".
 * Characters that are neither letters nor digits are unchanged.
 */
public class Cipher {
    public static void main(String[] args){
        String output = "";
        String s = "NFFU NF BU 23 JO UIF CFMM UPXFS A 0 @ #";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                output += s.charAt(i);
            }
            else {
                char temp;
                temp = s.charAt(i);
                if(temp == 'a'){
                    output += 'z';
                }
                else if(temp == '0'){
                    output += '9';
                }
                else if(!Character.isAlphabetic(temp) || Character.isDigit(temp)){
                    output += temp;
                }
                else{
                    temp--;
                    output += temp;
                }

            }
        }
        System.out.println(output);
    }
}