package Question450;
import java.util.*;
import java.lang.*;

public class TrippingWater {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);

        //no. of test cases
        int T=sc.nextInt();

        //array of result;
        int[] result=new int[T];

        //for each case
        for(int i=0;i<T;i++)
        {
            //size of array
            int N=sc.nextInt();

            //array declaration
            int[] arr=new int[N];

            // max element and Result sum and index of max
            int sum=0;int index=0;

            //taking elements in arrays
            for(int j=0;j<N;j++)
            {
                arr[j]=sc.nextInt();
            }

            //finding maximum element
            for(int j=1;j<N;j++)
            {
                if(arr[index]<arr[j])
                {
                    index=j;
                }

            }

		  /*if max element is not the first elements
		 then we will take a pointer p1 while will point to the first element and
		  will increment and check wheather the next element is smaller then then min
		  then will add it to the sum other wish we replace min with the current element*/
            int min;

            if(index>0)
            {
                min=arr[0];
                for(int k=1;k<index;k++)
                {
                    if(arr[k]<=min)
                        sum+=min-arr[k];
                    else
                        min=arr[k];
                }
            }

            if(index<N-1)
            {
                min=arr[N-1];
                for(int k=N-1;k>index;k--)
                {
                    if(arr[k]<=min)
                        sum+=min-arr[k];
                    else
                        min=arr[k];
                }
            }

            //adding result
            result[i]=sum;

        }

        //printing result of all test cases
        for(int x:result)
        {
            System.out.println(x);
        }

    }

}
/*package whatever //do not write package name here */





