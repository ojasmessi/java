//Write a function to print the sum of all odd numbers from 1 to n.

package Exercise;

import java.util.Scanner;

public class exercise2 {

    public static int printSumOdd(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) { // function delcaration
                sum = sum + i;

            }
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // user input

        System.out.print("The sum of odd numbers are:");
        printSumOdd(n); // function call
    }

}
