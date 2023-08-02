//In this pattern the number of rows is number of columns.
// *   row 1 -> 1 column
// **  row 2 -> 2 columns and so on....
// ***  
// ****

public class pattern3 {
    public static void main(String args[]) {

        int n = 4;

        // outer loop -> rows
        for (int i = 1; i <= n; i++) {
            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
