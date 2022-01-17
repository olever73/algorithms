package de.teleran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Gcd_and_Lcm_Test {

    private GCDandLCM gcdlcm = new GCDandLCM();


    @Test
    public void gcdlcmAndNumberIsNumber() {

        assertEquals(3,gcdlcm.greatestCommonDivisor(9,48));

        assertEquals(144,gcdlcm.leastCommonMultiple(9, 48));
    }

    @Test
    public void shouldCalculateGCDofTwoPositiveNumbers() {
        assertEquals(120, gcdlcm.greatestCommonDivisor(1080, 1920));
        assertEquals(17280, gcdlcm.leastCommonMultiple(1080, 1920));
    }
    @Test
    public void bigNumbersNumbers() {
        assertEquals(11111, gcdlcm.greatestCommonDivisor(33333,88888));
        assertEquals(-119886, gcdlcm.leastCommonMultiple(33333, 88888));
    }



}
