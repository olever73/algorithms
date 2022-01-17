package de.teleran;

import java.util.PriorityQueue;

public class FuelStations {
    /**
     * @param l            the length of the way
     * @param fuelStations the points for refueling (km from the start)
     * @param maxDistance  the distance which is reachable by one refueling
     * @return number of stops for refueling
     */
    //(950, {200, 375, 550, 750})
    //
    public static int getFuelingNumber(int l, int maxDistance, int[] fuelStations) {
        if (l <= maxDistance) return 0;
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        maxQueue.add(maxDistance);
        int result = -1, currPos = 0, currStation = 0;
        while (currPos < l && maxQueue.size() > 0) {
            currPos += maxQueue.remove();
            result++;
            while (currStation < fuelStations.length && fuelStations[currStation] <= currPos) {
                maxQueue.add(fuelStations[currStation++]);
            }
        }
        return l <= currPos ? result : -1;

    }
}
