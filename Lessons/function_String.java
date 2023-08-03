import java.util.Scanner;

public class function_String {

    public static void printMyName(String name){
        System.out.println(name);          // function declare krna
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);       // input lena
        String name = sc.next();

        printMyName(name);     // Function ko call krna

    
    }
}
