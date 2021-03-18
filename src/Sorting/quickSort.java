package Sorting;

import java.util.Scanner;

public class quickSort {
    void sort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int pindex=partition(arr,start,end);
            sort(arr,start,pindex-1);
            sort(arr,pindex+1,end);
        }
    }
    int partition(int[] arr,int start,int end)
    {   int pivot=arr[end];
        int pindex=start;
        for(int i=start;i<=end-1;i++)
        {
            if(arr[i]<pivot)
            {
                int temp=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=temp;
                pindex+=1;
            }
        }
        int temp=arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=temp;
        return pindex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( int e:arr)
        {
            System.out.print(e+" ");
        }
        System.out.println();
        quickSort obj=new quickSort();
        obj.sort(arr,0,arr.length-1);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
    }
}
