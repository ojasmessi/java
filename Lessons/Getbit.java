// Getbit at 3rd bit of number n = 0101
public class Getbit {
    public static void main(String args[]) {

        int n = 5; // n = (0101) -> convert to decimal = 5
        int position = 2;
        int bitMask = 1 << position;
        /*
         * 1 << 2
         * 0001 << 2 => 0100
         */
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
