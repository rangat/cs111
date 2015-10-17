package com.weeks1to5;

/**
 * Created by User on 10/16/2015.
 */
public class GCF {
    public static int find(int x, int y){
        int larger = 0;
        int smaller = 0;
        if (x>y){
            larger = x;
            smaller = y;
        }
        if (y>x){
            larger = y;
            smaller = x;
        }
        int gcf = 1;
        for(int i = smaller; i>0; i--){
            if((larger%i == 0) && (smaller%i == 0)){
                gcf = i;
            }
        }
        return gcf;
    }
}
