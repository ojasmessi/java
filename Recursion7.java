public class Recursion7 {
    public static int CalPower(int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        } if(x==0){
            return 0; // base case 2
        }

        // n is even
        if (n % 2 ==0) {
            return CalPower(x, n/2) * CalPower(x, n/2); 
        }
        else{
            return CalPower(x, n/2) * CalPower(x, n/2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans =  CalPower(x, n);
System.out.println(ans);
    }
}
