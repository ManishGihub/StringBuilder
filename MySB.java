package StringBuilderSB;

public class MySB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'S');
        System.out.println(sb);

        sb.insert(0,'T');
        System.out.println(sb);

        sb.append('y');
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);
    }
}

// Tony
// 4
// T
// Sony
// TSony
// TSonyy
// Tnyy