// print 5 to 1
public class Recursion1 {

    // function declare
    public static void PrintNum(int n) {
        // BASE
        if (n == 0) {
            return;
        }

        // print
        System.out.println(n);

        // recursion
        PrintNum(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;

        // function call
        PrintNum(n);

    }
}
