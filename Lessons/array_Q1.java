/*Take an array as a input from the user. search for a given number x 
print the index at which it occurs */

import java.util.Scanner;

public class array_Q1 {
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input 
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==x) {
                System.out.println("x found at index: " + i);
            }else{
                System.out.println("not found");
            }
        }
 
    }
}
