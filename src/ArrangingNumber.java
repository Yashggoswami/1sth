import java.util.*;
public class ArrangingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,5};
            

        int[] sortedarr=new int[arr.length];
        int count=0;
        for(int i:arr)
        {
            sortedarr[count++]=i;
        }
        count=0;
        Arrays.sort(sortedarr);

        while(!Arrays.equals(arr,sortedarr))
        {


           for(int i=arr.length-1;i>=1;i--)
           {
               if(arr[i]<arr[i-1])
               {
                   int temp=arr[i];
                   arr[i]=arr[i-1];
                   arr[i-1]=temp;
                   count+=1;
               }
           }


        }

        System.out.println(count);
    }
}
