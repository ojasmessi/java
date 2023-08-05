
/* Syntax 
type[] arrayName = new type [size] 
*/
import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {

        // int[] marks = new int[3];
        // int marks[] = new int[3];

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // int marks[] = {97,96,98}; (when you know the sizes)

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // input 
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
