import java.util.Scanner;

public class functionint {

    public static int CalculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a, b);
        System.out.println("Sum of 2 numbers are: " + sum);
        
    
    }
}