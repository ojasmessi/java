
/* factorial n! 
2! = 2*1
3! = 3*2*1 and so on...         for(int i=n to 1)
*/
import java.util.Scanner;

public class functionfatorial {

    public static void printFactorial(int n) {

        // loop
        if (n < 0) {
            System.out.print("invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
