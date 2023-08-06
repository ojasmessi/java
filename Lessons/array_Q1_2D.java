/*Take an matrix as a input from the user. search for a given number x 
print the index at which it occurs */

import java.util.Scanner;

public class array_Q1_2D {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("X found at location: (" + i + ", " + j + ")");
                } 
            }
            System.out.println();
        }

    }
}
