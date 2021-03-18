package Sorting;

import java.util.Scanner;

public class selectionSort {
    public int[] Sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[index]>arr[j])
                {
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        selectionSort obj=new selectionSort();

        for(int e:arr)
        {
            System.out.print(e);
        }
        System.out.println();
        arr=obj.Sort(arr);
        for(int e:arr)
        {
            System.out.print(e);
        }
    }
}
