// print factorial of n
public class Recursion4 {
    public static int calculateFact(int n) {
        if (n == 1) {
            return 1;
        }

        int Fact_num1 = calculateFact(n - 1); // n-1
        int Fact_num = n * Fact_num1; // n! = n * (n-1)
        return Fact_num; // recursion

    }

    public static void main(String args[]) {
        int n = 5;
        int ans = calculateFact(n);
        System.out.println(ans);
    }
}
