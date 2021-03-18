package Question;
import java.util.*;
public class KthMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        int k=kthSmallest(arr,0,size-1,index);
        System.out.println("Kth minimum element is "+k);
    }
    static int kthSmallest(int arr[], int l, int r, int k) {
        //code here
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=l;i<=r;i++)
        {
            if(queue.size()<k){
                queue.add(arr[i]);
            }
            else
            {
                if(queue.peek()>arr[i]){
                    queue.poll();
                    queue.add(arr[i]);}
            }
        }
        System.out.println("end" + queue);
        return queue.peek();
    }
}
