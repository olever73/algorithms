package de.teleran;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UboundedKnapsackTest {

    UboundedKnapsack uk = new UboundedKnapsack();

    @Test
    public void test_UboundenKnapsack_1() {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};

        int n = val.length;
        assertEquals(300, uk.unlimitedKnapsack(100, 3, val, wt));

    }

    @Test
    public void test_UboundenKnapsack_2() {
        int W = 8;

        int val[] = {10, 40, 50, 70};
        int wt[] = {1, 3, 4, 5};
        int n = val.length;
        assertEquals(110, uk.unlimitedKnapsack(8, 4, val, wt));
    }
    @Test
    public void test_UboundenKnapsack_3() {
        int W = 3;

        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        assertEquals(0, uk.unlimitedKnapsack(3, 3, val, wt));
    }

    @Test
    public void test_UboundenKnapsack_4() {
        int W = 25;

        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        assertEquals(70, uk.unlimitedKnapsack(25, 3, val, wt));
    }


}