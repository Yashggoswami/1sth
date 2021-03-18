import java.util.*;
public class AdditiveSequence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        boolean b=sequence(st,0,st.length());
        System.out.println(b);
    }
    public static boolean sequence(String st,int curr,int n)
    {
        if(curr+1==n)
        {
            return true;
             }
        if ((Integer.valueOf(st.charAt(curr))+Integer.valueOf(st.charAt(curr+1))==Integer.valueOf(st.charAt(curr+2))))
        {
            return sequence(st,curr+1,n);
        }else
        {
            return false;
        }




    }
}
