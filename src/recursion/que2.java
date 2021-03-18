package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        n=pow(n,p);
        System.out.println(n);
    }
    public static int pow(int n,int p)
    {   if(p==0) return 1;
        return n*pow(n,p-1);
    }


}
