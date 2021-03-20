import java.util.Scanner;

public class AsciiXor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int ans = (str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            ans = (ans ^ ((str.charAt(i))));
        }

        System.out.println(ans);
    }
}



