import java.util.Scanner;

public class SumTriangleFromArray {
    public static void helper(int[] arr,int n)
    {
        if(n<1) return;
        int[] temp=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            temp[i]=arr[i]+arr[i+1];
        }
        helper(temp,n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        helper(arr,n);
    }
}
