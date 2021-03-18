package recursion;

import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();

        permutation(s,0,s.length()-1);
    }
    public static  void permutation(String str ,int a, int r){
        if(a==r){
            System.out.println(str);
            return;}
        for(int i=a;i<=r;i++) {
//            System.out.println(str+" before");
            str=interchange(str,a,i);
            permutation(str,a+1,r);
//            str=interchange(str,a,i);
        }
    }
    public static String interchange(String s,int a, int r)
    {
        char[] array=s.toCharArray();
        char temp=array[a];
        array[a]=array[r];
        array[r]=temp;

        return String.copyValueOf(array);
    }
}
