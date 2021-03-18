package Question450;

import java.util.Scanner;

public class BuySellMaxProfit {
    public static int maxProfit(int[] arr)
    {
        int maxprofit=0;
        int buy=arr[0];
        int sell=0;
        int prev=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=prev)
            {
                sell=sell>arr[i]-buy?sell:arr[i]-buy;
                System.out.println(sell);
            }else{
                buy=arr[i];
                maxprofit+=sell;
                sell=0;
            }
            prev=arr[i];
        }
        maxprofit+=sell;
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Output : "+maxProfit(arr));
    }
}
