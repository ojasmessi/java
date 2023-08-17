// print 5 to 1
public class Recursion2 {

    // function declare
    public static void PrintNum(int n) {
        // BASE
        if (n == 6) {
            return;
        }

        // print
        System.out.println(n);

        // recursion
        PrintNum(n + 1);
    }

    public static void main(String args[]) {
        int n = 1;

        // function call
        PrintNum(n);

    }
}
