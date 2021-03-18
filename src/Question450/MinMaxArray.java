package Question450;
import java.util.*;

public class MinMaxArray {
    static class Pair{
        int min;
        int max;

        Pair(int min ,int max){
            this.min=min;
            this.max=max;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Pair minmax=new Pair(arr[0],arr[0]);

        for(int x:arr)
        {
            if(x<minmax.min)
                minmax.min=x;
            if(x>minmax.max)
                minmax.max=x;
        }
        System.out.println("Minimum and Maximum in array are -: "+minmax.min+" and "+minmax.max);
    }

}
