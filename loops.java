import java.util.Scanner;

public class loops {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // // counter++ => counter = counter + 1
    // for(int counter = 0; counter<11; counter++)
    // System.out.print(counter+" ");

    // for(int i=0; i<11; i++)
    // System.out.println(i);


    // int i = 0;
    // while (i<11) {
    //     System.out.println(i);
    //     i = i + 1;    //i++
    // }

    // int i = 0;
    // do {
    //     System.out.println(i);
    //     i++;
    // } while (i<11);

int sum = 0;
    for(int i=1; i<=n; i++){
    sum = sum + i;
}
System.out.println(sum);
 }   
}
