package com.week7;

/**
 * Created by rangat on 11/3/2015.
 */
public class PigLatin {
    public static void main(String[] arg){
        System.out.println(translate("      "));
    }
    public static  String translate(String word){
        String temp = word.toLowerCase();
        if(temp.length()<1){
            return "";
        }
        String c = temp.substring(0,1);
        if(c.equals( "a") || c.equals("e")  || c.equals("i") || c.equals("o") || c.equals("u")){
            word = word + "way";
        }
        else {
            word =  word.substring(1) + word.charAt(0)+"ay";
        }
        return word;
    }
}