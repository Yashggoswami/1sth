package recursion;
import java.util.Scanner;
public class binaryEquivalent {


    static void fun1(int n)
    {
        int i = 0;
        if (n > 1)
            fun1(n - 1);
        for (i = 0; i < n; i++)
            System.out.print(" * ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        System.out.println(binary(i));
        fun1(5);
    }
    public static int binary(int n){
        if(n==0)return 1;
        System.out.print(n%2);

         binary(n/2);
         System.out.print(n%2);

        return 1;
    }
}
