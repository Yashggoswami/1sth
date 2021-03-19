import java.util.*;

public class backnforth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String backward=str.substring(1)+str.charAt(0);
        String foreward=str.charAt(str.length()-1)+str.substring(0,str.length()-1);

        if(backward.equalsIgnoreCase(foreward))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
