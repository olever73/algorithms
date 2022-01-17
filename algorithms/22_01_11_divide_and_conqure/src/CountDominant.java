


public class CountDominant {

    //TODO
    // Есть массив с положительными int. Необходимо найти элемент (если он есть), который встречается в
    // массиве > length/2 (доминантный). В противном случае вернуть -1.
    // Подсказка. Если такой элемент есть, значит, что в одной из половин массива этот элемент также
    // встречается не меньше, чем размер подмассива пополам. {2, 2, 2, 3, 2, 3}
    public static void main(String args[]) {
        int arr[] = {30, 1,6, 42, 5, 5, 3, 56, 9};
        int n = arr.length;
        int x = 20;
        //System.out.print(countDominant(arr, 0, n - 1, x));
    }
    // Function to return the frequency of x
    // in the subarray arr[low...high]
    static int countDominant(int arr[], int low, int high, int x) {
        // If the subarray is invalid or the
        // element is not found
        if ((low > high) || (low == high && arr[low] != x))
            return 0;
        // If there's only a single element
        // which is equal to x
        if (low == high && arr[low] == x)
            return 1;
        // Divide the array into two parts and
        // then find the count of occurrences
        // of x in both the parts
        return countDominant(arr, low, (low + high) / 2, x)
                + countDominant(arr, 1 + (low + high) / 2, high, x);
    }


}













