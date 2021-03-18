package Question450;
import java.util.*;

public class NegativeAside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int p1=0;
        int p2=size-1;
        while(p1<p2)
        {
            if(arr[p1]>0 && arr[p2]<0){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
            }
            if(arr[p1]<0) p1++;
            if(arr[p2]>0) p2--;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
