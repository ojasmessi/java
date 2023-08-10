public class insertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // insertion sort
        // i = 1 -> because it will start with 0th index of array as we assumed i in
        // sorted part.
        for (int i = 1; i < arr.length; i++) {

            // now we are in unsorted part the current value will be assigned to 1st index
            // of array
            int current = arr[i];
            int j = i - 1; // we have to take the values to the sorted part.
            while (j >= 0 && current < arr[j]) { // current -> 7, arr[j] -> 8
                arr[j + 1] = arr[j]; // 7<8 (true) -> {7,8}
                j--;
            }
            // placement
            arr[j + 1] = current; // if 7<3 (false) -> so the current value will be put there as is it.
        }
        printArray(arr);
    }
}
