
import java.util.*;
import java.lang.*;

public class RotiPrata
{
    public static long totalTime(long[] chef,long time,int n)
    {
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(chef[i]*(time*((time+1)/2)));
        }
        return sum;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long[] chef=new long[n];
            long max=0;
            for(int j=0;j<n;j++)
            {
                chef[j]=sc.nextInt();
                max=Math.max(chef[j],max);
            }
            int roties=sc.nextInt();
            long h=max;
            long l=0;
            long ans=0;
            for(int j=1;j<roties;j++)
            {

                h+=j*max;
            }

            while(l<=h)
            {
                long mid=l+(h-l)/2;
                long rotimade=totalTime(chef,mid,n);
                if(rotimade>roties)
                {	ans=Math.max(ans,mid);
                    l=mid+1;

                }else if(rotimade<roties)
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
}