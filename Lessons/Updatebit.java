// Update the 2nd bit (pos = 1) of number n = 0101

import java.util.Scanner;

public class Updatebit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        // oper = 1 : set bit
        // oper = 0 : clear bit
        int n = 5; // 0101
        int position = 1;
        int bitMask = 1 << position;

        // set bit
        if (operation == 1) {

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        } else {
            // clear bit

            int newBitMask = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
        }

    }
}
