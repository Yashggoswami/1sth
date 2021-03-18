import java.util.*;

public class recursivePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr=new char[]{'a','b'};
        int k=sc.nextInt();
        ArrayList<String> result=new ArrayList<>();
        findpattern(arr,"",result,k,arr.length);
        for(String i:result){
            System.out.println(i);
        }
    }
    public static void findpattern(char[] arr,String currentstr,ArrayList<String> result,int k, int n)
    {
        if(currentstr.length()>=k)
        {
            result.add(currentstr);
            return;
        }

        for(int i=0;i<n;i++)
        {
            String str=currentstr+arr[i];
            findpattern(arr,str,result,k,n);
        }
    }
}
