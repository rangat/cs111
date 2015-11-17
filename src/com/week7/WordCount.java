package com.week7;

/**
 * Created by User on 11/3/2015.
 */
public class WordCount {
    public static void main(String[] args){
        System.out.println(countWords("baaaaaaaad boy", 0));

    }
    public static int countWords(String count,int n){
        int realCount = 0;
        for(int i = 0;i<=count.length();i++){
            int charCount = 0;
            while(i<count.length() && count.charAt(i) != ' '){
                if((Character.isLetter(count.charAt(i)) == false|| Character.isDigit(count.charAt(i)))){
                    i++;
                }
                else {
                    charCount++;
                    i++;
                }
            }
            if(charCount>=n){
                realCount++;
            }
        }
        return  realCount;
    }
}