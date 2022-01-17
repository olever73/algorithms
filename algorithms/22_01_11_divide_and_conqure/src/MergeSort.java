public class MergeSort {

        public static void mergeSort(int[] numbers, int n) {
            n= numbers.length;
            if (numbers.length < 2) {
                return;
            }
            int middleIndex = numbers.length  / 2;
            int[] l = new int[middleIndex];
            int[] r = new int[numbers.length - middleIndex];

            for (int i = 0; i < middleIndex; i++) {
                l[i] = numbers[i];
            }
            for (int i = middleIndex; i < numbers.length ; i++) {
                r[i - middleIndex] = numbers[i];
            }
            mergeSort(l, middleIndex);
            mergeSort(r, numbers.length  - middleIndex);

            merge(numbers, l, r, middleIndex, numbers.length  - middleIndex);
        }
        public static void merge(
                int[] numbers, int[] l, int[] r, int left, int right) {

            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    numbers[k++] = l[i++];
                }
                else {
                    numbers[k++] = r[j++];
                }
            }
            while (i < left) {
                numbers[k++] = l[i++];
            }
            while (j < right) {
                numbers[k++] = r[j++];
            }
        }

    }




