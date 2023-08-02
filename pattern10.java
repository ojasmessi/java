Butterfly Pattern
/*
 pattern: 
*      *
**    **   
***  ***
********
********
***  ***
**    **
*      *
 */
public class pattern10 {
    public static void main(String args[]) {

        int n = 4;
        // upper half
        // left part
        // outer loop -> rows
        for (int i = 1; i <= n; i++) {
            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
