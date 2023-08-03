/*
 pattern: 
 1     row(i) -> 1 to n
 12    columns(j)  -> 1 to i  
 123
 1234
 12345
 */
public class pattern6 {
    public static void main(String args[]) {
        int n = 5;
        // outer loop -> rows
        for (int i = 1; i <= n; i++) {

            // inner loop -> colums
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
