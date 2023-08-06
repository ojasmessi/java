
//Array2D : type[][] arrayName = new type[rows][columns]
import java.util.Scanner;

public class array2D {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }

            System.out.println();

        }

    }
}
