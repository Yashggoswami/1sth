package Question;

public class MergeIfNotPalindrome {
    public static void main(String[] args) {
        int arr[]={1,4,6,2,4,5,1};
        int count=0,p1=0,p2=arr.length-1,sum1=0,sum2=0;
        while(p1<p2)
        {
            if(sum1+arr[p1]==sum2+arr[p2])
            {
                System.out.println(sum1+" "+arr[p1]+" "+sum2+" "+arr[p2]);

                p1++;p2--;
                 sum1=0;sum2=0;
            }
            else if(sum1+arr[p1]<sum2+arr[p2])
            {
                sum1+=arr[p1];
                p1++;
                count++;
            }
            else{
                sum2+=arr[p2];
                p2--;
                count++;
            }
        }
        System.out.println(count);

    }
}
