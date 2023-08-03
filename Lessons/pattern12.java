/*
 pattern: 
     1         n = 5   
    2 2       space = n - i  (i=1 -> 5 - 1 = 4  -> n-i)
   3 3 3      
  4 4 4 4
 5 5 5 5 5
 */
public class pattern12 {
    public static void main(String args[]) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <=n - i; j++) {
                System.out.print(" ");
            }
            // numbers -> print row number, row number times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
