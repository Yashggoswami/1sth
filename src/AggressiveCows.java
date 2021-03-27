import java.util.*;

public class AggressiveCows {
    public static boolean isValid(int[] arr,int n,int k,int mid)
    {
        int cow=1;
        int lastposition=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]-lastposition>mid)
            {
                cow++;
                if(cow==k)
                    return false;
                lastposition=arr[i];
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];

            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();

            Arrays.sort(arr);


            int l=0;
            int h=arr[arr.length-1]-arr[0];
            int mid=0;
            while(l<=h)
            {
                mid=l+(h-l)/2;
                if(isValid(arr,n,k,mid))
                {
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            System.out.println(mid);

        }


    }
}
