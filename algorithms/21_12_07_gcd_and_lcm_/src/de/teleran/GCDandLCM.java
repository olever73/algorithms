package de.teleran;

import java.math.BigInteger;

public class GCDandLCM {

    public static void main(String[] args) {
        // 	найти НОД (нибольший общий делитель), найти НОК.


    }
    static int greatestCommonDivisor(int a, int b) {

        while (a != b) {
            if (a > b)
                a = a - b;

            else
                b = b - a;
        }
        System.out.println( a);
        return a;
    }

    static int leastCommonMultiple(int a,int b ){
        return  (a*b)/ greatestCommonDivisor(a,b);
    }



}



