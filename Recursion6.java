public class Recursion6 {
    public static int CalPower(int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        } if(x==0){
            return 0; // base case 2
        }

        int xPownum1 = CalPower(x, n - 1); // n-1
        int xPown = x * xPownum1;
        return xPown; // x * x(n-1)
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans =  CalPower(x, n);
System.out.println(ans);
    }
}
