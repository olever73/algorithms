package de.telran;


import org.junit.Test;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MedianOfIntegerStreamTest {


    @Test
    public void givenStreamOfIntegers_whenAnElementIsRead_thenMedianChangesWithApproach1() {
        MedianOfIntegerStream mis = new MedianOfIntegerStream();
        for (Map.Entry<Integer, Double> e : testcase1().entrySet()) {
            mis.add(e.getKey());
            assertEquals(e.getValue(), (Double) mis.getMedian());
        }


    }

    private Map<Integer, Double> testcase1() {
        return new LinkedHashMap<Integer, Double>() {{
            put(1, 1d);
            put(7, 4d);
            put(5, 5d);
            put(8, 6d);
            put(3, 5d);
            put(9, 6d);
            put(4, 5d);
        }};
    }

    @Test
    public void givenStreamOfIntegers_whenAnElementIsRead_thenMedianChangesWithApproach2() {
        MedianOfIntegerStream mis = new MedianOfIntegerStream();
        for (Map.Entry<Integer, Double> e : testcase2().entrySet()) {
            mis.add(e.getKey());
            assertEquals(e.getValue(), (Double) mis.getMedian());

        }

    }

    private Map<Integer, Double> testcase2() {
        return new LinkedHashMap<Integer, Double>() {{
            put(2, 2d);
            put(3, 2d);
            put(4, 3d);
            put(5, 3d);
            put(8, 4d);
            put(128, 4d);

        }};
    }

}