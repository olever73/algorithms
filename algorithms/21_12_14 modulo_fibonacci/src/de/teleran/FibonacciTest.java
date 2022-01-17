package de.teleran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

        private Fibonacci f = new Fibonacci();

        @Test
        public void testReminder() {
            assertEquals(4, f.moduloFibonacci(11, 10));
            assertEquals(20, f.moduloFibonacci(1597, 21));
        }

    }



