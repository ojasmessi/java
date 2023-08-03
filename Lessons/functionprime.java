import java.util.Scanner;

public class functionprime {

    public static void printPrimeNumber(int n){

        if (n%2==0) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("Its not a prime number.");
        }
    }
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPrimeNumber(n);
    }
}
