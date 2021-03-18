package Question450;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=size-1;
        for(int i=0;i<size/2;i++)
        {
            arr[i]=arr[i]+arr[n-i];
            arr[n-i]=arr[i]-arr[n-i];
            arr[i]=arr[i]-arr[n-i];
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
