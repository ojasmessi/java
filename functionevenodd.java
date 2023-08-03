import java.util.Scanner;

public class functionevenodd {

    public static void printEvenOdd(int n){

        if (n%2==0) {
            System.out.print("Its an even number.");
        } else {
            System.out.print("Its an odd number.");
            
        }
    }
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printEvenOdd(n);
    }
}
