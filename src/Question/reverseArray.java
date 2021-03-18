package Question;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Enter elements in the array");
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }

        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        int mid=arr.length/2;
        for(int i=0;i<mid;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println();
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
