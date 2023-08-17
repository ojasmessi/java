public class Recursion5 {
    public static void Printfibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c); // print
        // recursion
        Printfibo(b, c, n - 1); // n-1 -> coz the terms are decreasing as n is adding
    }

    public static void main(String args[]) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        // fucntion call
        Printfibo(a, b, n - 2); // already a and b these two terms are printing
    }
}
