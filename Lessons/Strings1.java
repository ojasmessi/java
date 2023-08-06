public class Strings1 {
    public static void main(String args[]) {
        // compare

        String name1 = "ojas";
        String name2 = "ojas2";

        /* 1  s1 > s2 : +ve no.
         * 2  s1 == s2 : 0
         * 3  s1 < s2 : -ve no.
         */

        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not eqaul");
        }
    }
}
