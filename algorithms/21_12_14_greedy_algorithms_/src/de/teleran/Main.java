package de.teleran;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }
    /**
     * Compose the money from the coins 1, 5, 10 cent, so that the number of coins is min possible
     *
     * @param money the amount of money to compose
     * @return the min possible number of coins, which compose the (amount of) money
     */

    // 23 -> 10 + 10 + 1 + 1 + 1
    public int exchangeMoney(int money) {

        int count = 0;
        int TenCents=0;
        int FiveCents=0;
        int OneCent=0;

        while(money > 0){

            while (money - 10 >= 0){
                money-=10;
                count++;
                TenCents++;
            }

            while (money - 5 >= 0){
                money-=5;
                count++;
                FiveCents++;
            }

            while (money - 1 >= 0){
                money-=1;
                count++;
                OneCent++;
            }
        }
        return count;
    }



    /**
     * The method must return the min possible number of segment of the length l, so that all the numbers are covered
     * by these segments
     *
     * @param numbers an array of sorted numbers
     * @param l       the length of the segments
     * @return
     */
    public   int getSegmentNumber(int[] numbers, int l) {

        return 1;
            //написать цикл, который обходит все точки, начиная с i-той, которые залезают в отрезок длины l с началом в leftSegmentEnd
        }

        
}