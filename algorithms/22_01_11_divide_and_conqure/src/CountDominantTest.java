import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDominantTest {

       CountDominant dominant=new CountDominant();

        @Test
        public void testcountDominanntElement_5() {
            int arr[] = {30, 5,5, 42, 5, 5, 3, 5, 9};
            assertEquals(5, dominant.countDominant(arr, 0,arr.length-1,5));
        }
         @Test
         public void testOneDominanntElement_() {
        int arr[] = {3, 1,6, 42, 0, 5, 90, 56, 9};
        assertEquals(1, dominant.countDominant(arr, 0,arr.length-1,90));
    }

        @Test
        public void testcountWithoutDominants_() {
            int arr[] = {3, 1,6, 42, 0, 5, 90, 56, 9};
            assertEquals(0, dominant.countDominant(arr, 0,arr.length-1,22));
        }

    }
