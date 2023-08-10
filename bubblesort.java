public class bubblesort {

    // function syntax => returnType functionName (type arg 1, type arg 2)
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {    // function declaration
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {

        // array syntax : type[] array name = new type[size]
        int arr[] = { 7, 8, 3, 1, 2 };
        // time complixity = O(n^2)
        // bubble sort
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) { // arr.length = n
            // inner loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // arr[i] => first position, arr[i+1] => second position
                    // swap
                    int temp = arr[j];    // a = b
                    arr[j] = arr[j + 1];  //  b = c 
                    arr[j + 1] = temp;    //  c = a
                }
            }
        }
        printArray(arr);      // function call
    }
}
