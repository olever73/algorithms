import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;



    class MainTest {

        @Test
        public void positiveTest() {
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            MergeSort.mergeSort(actual, actual.length);
            assertArrayEquals(expected, actual);
        }
        @Test
        public void zeroElementTest() {
            int[] actual = { };
            int[] expected = { };
            MergeSort.mergeSort(actual, actual.length);
            assertArrayEquals(expected, actual);
        }
        @Test
        public void negativElementTest() {
            int[] actual = {-3,5,23,-1,0,-34};
            int[] expected = { -34,-3,-1,0,5,23};
            MergeSort.mergeSort(actual, actual.length);
            assertArrayEquals(expected, actual);
        }

    }


