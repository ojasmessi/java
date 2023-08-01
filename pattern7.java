/*
 pattern: 
 12345
 1234
 123
 12
 1
 */
public class pattern7 {
    public static void main(String args[]) {
int n=5;
        // outer loop -> rows
        for (int i = n; i >= 1; i--) {

            // outer loop -> columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
