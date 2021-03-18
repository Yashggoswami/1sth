package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=sum(n);
        System.out.println(n);
    }
    public static int sum(int n)
    {   if(n==0) return 0;
        return n+sum(n-1);
    }


}
