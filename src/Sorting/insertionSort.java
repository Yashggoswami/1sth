package Sorting;
import java.util.Scanner;
public class insertionSort {

    public static int[] Sort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int num=arr[i];
            int j=i-1;
            while(arr[j]>num &&j>=0)
            {
                    arr[j+1]=arr[j];
                 j--;
            }
            arr[j+1]=num;

        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
         arr[i]=sc.nextInt();
        }
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
        System.out.println();
       arr=Sort(arr);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }

    }
}
