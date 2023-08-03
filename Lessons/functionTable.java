import java.util.Scanner;

public class functionTable {
 public static void printTable(int n){

    //loop
    for(int i=1; i<11; i++){
        System.out.println("The following tables are: " + i*n);
    }
 }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printTable(n);
    }
}
