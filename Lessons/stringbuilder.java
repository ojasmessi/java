public class stringbuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("ojas");
        System.out.println(sb);

        // charAt at index 0
        System.out.println(sb.charAt(0));

        // set char index
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        // insert any character
        sb.insert(3, 'S');
        System.out.println(sb);

        // delete the extra
        sb.delete(0, 2);
        System.out.println(sb);

        // delete the charAt with index
        sb.deleteCharAt(2);
        System.out.println(sb);

        // append the charaters
        sb.append("S");
        System.out.println(sb.length());
    }
}
