package Sorting;

import java.util.Scanner;

public class mergeSort {
public static void MergeSort(int[] arr)
{
    int n=arr.length;
    if(n>=2) {
        int mid = n / 2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for(int i=0;i<mid;i++)
        {
            left[i]=arr[i];
        }

        for(int i=mid;i<n;i++)
        {
            right[i-mid]=arr[i];
        }
        MergeSort(left);
        MergeSort(right);
        MergeHalf(left,right,arr);

    }
}
public static void MergeHalf(int[] left,int[] right,int[] temp)
{
    int i=0,j=0,k=0;
    while(i<left.length && j<right.length)
    {
        if(left[i]<right[j])
        {
            temp[k]=left[i];
            i++;
        }
        else{
            temp[k]=right[j];
            j++;
        }
        k++;
    }
    while(i<left.length)
    {
        temp[k]=left[i];k++;i++;
    }
    while(j<right.length)
    {
        temp[k]=right[j];k++;j++;
    }
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
        int[] temp=new int[arr.length];
        MergeSort(arr);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }

    }
}
