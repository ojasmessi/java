// Set  the 2nd bit (pos = 1) of number n = 0101
public class Setbit {
public static void main(String args[]){

    int n = 5;
    int position = 1;
    int bitMask = 1<<position;

    int newNumber = bitMask | n;
    System.out.println(newNumber);
}    
}
