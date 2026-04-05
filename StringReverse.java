package StringBuilderSB;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Patil";

        // Logic 1
        String str1 = "";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);

        // Logic 2
        StringBuilder sb = new StringBuilder("Patil");

        for(int i=0;i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}

// litaP
// litaP
