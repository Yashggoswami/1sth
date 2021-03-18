package Question450;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TripletSumArray {
    public static void main (String[] args) {
        //code


        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] result=new int[T];

        for(int q=0;q<T;q++){

            int N=sc.nextInt();
            int k=sc.nextInt();

            System.out.println("enter");
            SortedSet<Integer> st=new TreeSet<>();
            int[] art=new int[N];
            for(int i=0;i<N;i++)
            {
                art[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                System.out.println("aara");
                st.add(art[i]);
            }

            int[] arr=new int[st.size()];

            int u=0;
            for(Integer x:st){
                arr[u++]=x;}

            for(int i=0;i<arr.length-2;i++)
            {
                int sum=k-arr[i];
                int j=i+1;
                int k1=arr.length-1;
                while(j<k1)
                {
                    if(arr[j]+arr[k1]==sum)
                    {
                        result[q]=1;break;

                    }
                    else if(sum>arr[j]+arr[k1])
                        j++;
                    else
                        k--;
                }
                if(result[q]==1)
                    break;
            }

        }
        for(int x:result)
        {
            System.out.println(x);
        }

    }
}
