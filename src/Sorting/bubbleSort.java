package Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
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
        arr=sort(arr);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }

    }
}
