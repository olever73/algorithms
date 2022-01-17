package de.teleran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {


    @Test
    public void moneyTest23() {
        Main money = new Main();
        assertEquals(5, money.exchangeMoney(23));
    }

    @Test
    public void moneyTest100() {
        Main money = new Main();
        assertEquals(10, money.exchangeMoney(100));
    }

    @Test
    public void moneyTest1() {
        Main money = new Main();
        assertEquals(1, money.exchangeMoney(1));
    }

    @Test
    public void moneyTest111111111() {
        Main money = new Main();
        assertEquals(11111112, money.exchangeMoney(111111111));
    }



}