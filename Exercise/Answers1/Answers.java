/*
 * Problem 1👇
 * 
 * Enter 3 numbers from the user & make a function to print their average.
 * 
 * 
 * import java.util.*;
 * 
 * public class Main {
 * 
 * 
 * public static float average (float a , float b , float c) {
 * float sum = (a+b+c)/3;
 * System.out.println ("The average number is");
 * 
 * return sum;
 * }
 * 
 * 
 * public static void main (String []args)
 * 
 * {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the first number");
 * float a = sc.nextFloat();
 * 
 * System.out.println("Enter the second number");
 * float b = sc.nextFloat();
 * 
 * System.out.println("Enter the third number");
 * float c = sc.nextFloat();
 * 
 * System.out.println(average(a,b,c));
 * 
 * }
 * }
 * 
 * 
 * 
 * Problem 2 👇
 * 
 * 
 * Write a function to print the sum of all
 * 
 * odd numbers from 1 to n.
 * 
 * import java.util.*;
 * 
 * public class Main {
 * 
 * static int sum = 0;
 * static int sum (int n ) {
 * for (int i =1; i<=n; i++)
 * if (i%2==1)
 * sum +=i;    (sum = sum + i)
 * System.out.print("Sum of all odd numbers between 1 to "
 * + n + " = ");
 * return sum;
 * }
 * public static void main (String []args)
 * {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the number");
 * int n = sc.nextInt();
 * System.out.println(sum(n));
 * }
 * 
 * Problem 3👇
 * 
 * 
 * Write a function which takes in 2 numbers and returns the greater of
 * those two
 * 
 * import java.util.*;
 * 
 * public class Main {
 * static int Bignumber;
 * public static void Num (int a , int b )
 * {
 * if (a>b)
 * { Bignumber = a; }
 * else {
 * Bignumber = b; }
 * 
 * System.out.println("The greatest number between " + a + " and " + b + " is "+
 * Bignumber );
 * }
 * 
 * 
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first number");
 * int num1 = sc.nextInt();
 * System.out.println("Enter the second number");
 * int num2 = sc.nextInt();
 * 
 * Num(num1,num2);
 * }
 * 
 * }
 * 
 * 
 * problem 4 👇
 * 
 * 
 * Write a function that takes in the radius as input and returns the
 * circumference of a circle.
 * import java.util.*;
 * 
 * public class Main {
 * 
 * public static void Num (double r ){
 * double Circumference = (2 * 3.14) * r ;
 * 
 * System.out.println("circumference of the circle = " + Circumference );
 * }
 * 
 * 
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Radius");
 * double radius = sc.nextDouble();
 * 
 * Num(radius);
 * }
 * 
 * }
 * 
 * 
 * 
 * Problem 5 👇
 * 
 * 
 * /*Write a function that takes in age as input and returns if that person is
 * eligible to vote or not. A person of age > 18 is eligible to vote.
 * 
 * import java.util.*;
 * 
 * public class Main {
 * 
 * public static void Num (int age ){
 * if (age>18)
 * { System.out.println("You are eligble to vote") ;}
 * 
 * else {
 * System.out.println("You are not eligible"); }
 * }
 * 
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter your age");
 * int yourage = sc.nextInt();
 * 
 * Num(yourage);
 * }
 * 
 * }
 * 
 * 
 * 
 * Problem 6 👇
 * 
 * /*Write an infinite loop using do while
 * 
 * condition.
 * 
 * public class Main {
 * 
 * 
 * static void print(String value) {
 * do{
 * System.out.println(value);}
 * 
 * while(true);}
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * print("Subham");
 * 
 * }
 * }
 * 
 * 
 * 
 * Problem 7 👇
 * 
 * 
 * import java.util.*;
 * public class Question12 {
 * public static void main(String[] args) {
 * Scanner sc= new Scanner(System.in);
 * System.out.println("How many numbers you want to enter?\n");
 * int x= sc.nextInt();
 * int [] data= new int[x];
 * for(int i=0;i<data.length;i++){
 * System.out.println("Enter the number "+(i+1));
 * data[i]=sc.nextInt();
 * }
 * int count=0;
 * int negative=0;
 * int zero=0;
 * for(int i: data){
 * if(i>0){
 * count++;
 * }else if(i<0){
 * negative++;
 * }else if(i==0){
 * zero++;
 * }}
 * System.out.println("The positive number count is: "+count);
 * System.out.println("The negative number count is: "+negative);
 * System.out.println("The zero number count is: "+zero);
 * } }
 * 
 * 
 * 
 * 
 * 
 * Problem 8 👇
 * 
 * import java.util.*;
 * public class Main {
 * static void pow(int base , int power){
 * int subham= (int)Math.pow(base,power);
 * System.out.println(base + " to the power " + power + " is " + subham);
 * public static void main(String[] args) {
 * int base , power ;
 * Scanner sc = new Scanner (System.in);
 * System.out.println("enter the base");
 * base = sc.nextInt();
 * System.out.println("enter the power ");
 * power = sc.nextInt();
 * pow(base,power);
 * /* for (int i = 1 ; i <= power ; i++) {
 * subham = subham*base; }
 */
