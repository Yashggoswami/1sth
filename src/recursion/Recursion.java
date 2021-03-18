package recursion;
import java.util.Scanner;
public class Recursion {
    public static int recur(int n)
    {
        if(n==0) return 0;
        else if(n==1 || n==2) return 1;
        else return recur(n-1) + recur(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(""+recur(i));
        }
    }
}
