import java.util.ArrayList;
import java.util.Scanner;

public class sumofprevioustwo {
    public static boolean helper(int n1,int n2,String st,ArrayList<String> arr,boolean b)
    {   if(st.length()==0 && b==true) return true;
        String n3=String.valueOf(n1+n2);

        int jk=Math.min(n3.length(),st.length());
        if(st.substring(0,jk).equals(n3))
        {
            arr.add(n3);

            helper(n2,Integer.parseInt(n3),st.substring(jk),arr,true);
        }
    return false;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    ArrayList<String> arr=new ArrayList<>();
    int n=st.length();

    for(int i=1;i<n-1;i++)
    {
        int n1=Integer.parseInt(st.substring(0,i));
        String none=String.valueOf(n1);
        if(none.length()>=1 && none.charAt(0)=='0') continue;
        for(int j=i+1;j<n;j++)
        {
            int n2=Integer.parseInt(st.substring(i,j));
            String ntwo=String.valueOf(n2);
            if(ntwo.length()>=1 && ntwo.charAt(0)=='0') continue;

            boolean b=helper(n1,n2,st.substring(j),arr,false);
            if(b==true){
                System.out.println(n1+"\n"+n2);
            }
        }
    }
    for(String s:arr){
        System.out.println(s);
    }
    }
}
