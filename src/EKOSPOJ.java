
import java.util.*;
import java.lang.*;

public class EKOSPOJ
{
    public static long woodcutted(long[] tree,long height,int n)
    {
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(tree[i]>height)
            {
                sum+=tree[i]-height;
            }
        }
        return sum;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long neededwood=sc.nextInt();
        long[] tree=new long[n];
//
        long max=0;
        for(int i=0;i<n;i++)
        {
            tree[i]=sc.nextInt();
            max=Math.max(max,tree[i]);
        }

        for(int i=0;i<n;i++)
        {
            max=Math.max(max,tree[i]);
        }

        long l=0;
        long h=max;
        long ans=0;
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            if(woodcutted(tree,mid,n)>neededwood)
            {	ans=Math.max(ans,mid);
                l=mid+1;

            }else if(woodcutted(tree,mid,n)<neededwood)
            {
                h=mid-1;
            }else
            {
                ans=mid;
                break;
            }



        }

        System.out.println(ans);



    }
}