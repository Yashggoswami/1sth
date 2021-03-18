package Question;
import java.util.Scanner;
import java.util.PriorityQueue;
public class KthMinMax {
    public static void main(String[] args) {
        //entering and displaying elements in array
        System.out.println("Enter elements in the array");
        int[] arr=new int[6];
        System.out.println("Enter k ");
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
//displaying elements in array
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        int i=1;
        for(int x:arr)
        {
            minheap.add(x);
            if(i==k)
            {
                                
            }
        }
    }
}
