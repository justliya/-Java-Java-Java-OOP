public class Sort {

    public void insertionSort(int arr[]) {
        // Establish a temporary variable to store the value of the element being compared
        // Global scope so that the variable is recognized throughout entire method
        int temp;

        /*
         * Counter loop starting at index 1 to the limit bound of the length of array.
         * The index starting at 0 is the left side which is an already sorted array.
         */

        for (int k = 1; k < arr.length; k++) {

            // Local scope because it only needs to be recognized in nested for loop
            int i;

            // Take one unsorted element at a time

            temp = arr[k];

            /* Conditional nested loop that compares each value to the left of temp that is greater within index bounds 0 and greater */
            for (i = k - 1; i >= 0 && arr[i] > temp; i--)
                arr[i + 1] = arr[i];

            arr[i + 1] = temp;

        }

    }

    public void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");
       
        }
    }

    public static void main(String args[]) {

        int intArr[] = { 3, 5, 1, 7, 6, 4 };

        Sort sorter = new Sort();

        sorter.print(intArr);
        System.out.println();
        sorter.insertionSort(intArr);
        sorter.print(intArr);

    }
}