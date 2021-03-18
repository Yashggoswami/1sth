package Question;
import java.util.*;

public class minMax {
    public static void main(String[] args) {
        //entering and displaying elements in array
        System.out.println("Enter elements in the array");
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
//displaying elements in array
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        minMax obj=new minMax();
        int min=obj.min_array(arr);
        int max=obj.max_array(arr);
        System.out.println("Minimum and maximum elements in array -");
        System.out.println(min+" and "+max);
    }
    public int min_array(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int x:arr){
            if(min>x) min=x;
        }
        return min;
    }

    public int max_array(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int x:arr){
            if(max<x) max=x;
        }
        return max;
    }
}
