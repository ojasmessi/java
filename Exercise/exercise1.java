//Enter 3 numbers from the user & make a function to print their average.

package Exercise;

import java.util.Scanner;

public class exercise1 {

    public static float printAverage(float a, float b, float c) {
        float sum = (a + b + c) / 3;

        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float sum = printAverage(a, b, c);
        System.out.println("Average of 3 numbers are: " + sum);
//System.out.println(average(a,b,c))
    }
}
