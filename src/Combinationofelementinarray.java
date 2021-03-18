import java.util.ArrayList;
import java.util.Scanner;

public class Combinationofelementinarray {
    public static void findCombination(int[] arr,int r,int index,int i,int length,int data[])
    {

        if(index==r){
            for(int q=0;q<data.length;q++)
            {
                System.out.print(data[q]+" ");
            }
            System.out.println();
            return;
        }
        if(i>=length) return;

        data[index]=arr[i];
        findCombination(arr,r,index+1,i+1,length,data);
        findCombination(arr,r,index,i+1,length,data);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        System.out.println("Enter the required length of string");
        int r=sc.nextInt();
        int[] data=new int[r];

        findCombination(arr,r,0,0,arr.length,data);
    }
}
