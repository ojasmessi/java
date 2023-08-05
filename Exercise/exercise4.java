package Exercise;

import java.util.Scanner;

public class exercise4 {

    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();

        System.out.print(getCircumference(radius));
    }
}
