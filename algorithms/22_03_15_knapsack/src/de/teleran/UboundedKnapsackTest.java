package de.teleran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UboundedKnapsackTest {

    UboundedKnapsack uk = new UboundedKnapsack();
    @Test
    public void test_UboundenKnapsack_10() {
        int value[] = new int[] { 25, 30, 15 };
        int weight[] = new int[] { 15, 5, 10 };
        int с = 60;

        assertEquals(70, uk.getMaximumKnapsack(60, weight,value,3));

    }



}