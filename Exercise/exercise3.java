package Exercise;

import java.util.Scanner;

public class exercise3 {

    public static int getGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();


        System.out.println("Greater number is:");
        System.out.println(getGreater(a, b));
    }

}
