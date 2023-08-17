public class recursion3 {

    public static void PrintSum(int i, int n, int sum) {
        // BASE
        if (i == n) {
            sum += 1;
            System.out.println(sum);
            return;
        }
        sum += i; // calculate
        PrintSum(i + 1, n, sum); // recursion
        System.out.println(i);

    }   

    public static void main(String args[]) {
        PrintSum(1, 5, 0);
    }
}
