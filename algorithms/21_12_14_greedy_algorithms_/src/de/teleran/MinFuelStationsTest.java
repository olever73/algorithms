package de.teleran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinFuelStationsTest {
    
    @Test
    public void fuelStationsTest900(){
        FuelStations fs = new FuelStations();
        int[] fuelStations = {200, 375, 550, 750};
        assertEquals(2, fs.getFuelingNumber(900, 400, fuelStations));
    }

    @Test
    public void fuelStationsTestDist200(){
        FuelStations fs = new FuelStations();
        int[] fuelStations = {200, 375, 550, 750};
        assertEquals(3, fs.getFuelingNumber(900, 200, fuelStations));
    }


    @Test
    public void fuelStationsTest200(){
        FuelStations fs = new FuelStations();
        int[] fuelStations = {200, 375, 550, 750,900};
        assertEquals(0, fs.getFuelingNumber(200, 400, fuelStations));
    }
}

