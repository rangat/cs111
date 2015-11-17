package com.week7;

/**
 * Created by User on 11/3/2015.
 */
public class Compress {
    public static void main(String[] args) {
        System.out.print(compress(""));
    }

    public static String compress(String original) {
        String output = "";
        for (int i = 0; i < original.length(); i++) {
            int j = 1;
            while (i+1 < original.length() && (original.charAt(i) == original.charAt(i + 1))) {
                j++;
                i++;
            }
            String character = original.substring(i, i + 1);
            if (j > 1) {
                output = output + j + character;
            } else {
                output = output + character;
            }
        }
        return output;
    }
}