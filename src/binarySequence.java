import java.util.*;
public class binarySequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int[] out=new int[2*n];
        validbinary(0,out,0,2*n-1);

    }
    public static void validbinary(int diff,int[] out,int start,int end)
    {   if(Math.abs(diff)>(end-start+1)/2) return;

        if(start>end)
        {
            if(diff==0)
                for(int x:out){
                    System.out.print(x);
                }
            System.out.println();
        }
        out[start]=0;
        out[end]=1;
        validbinary(diff+1,out,start+1,end-1);
        out[start]=out[end]=0;
        validbinary(diff,out,start+1,end-1);
        out[start]=out[end]=1;
        validbinary(diff,out ,start+1,end-1);
        out[start]=1;
        out[end]=0;
        validbinary(diff-1,out,start+1,end-1);
    }
}
