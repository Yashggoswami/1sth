import java.util.*;
//Input : K = 3
//Output : 000 , 001 , 010 , 100 , 101
public class binaryString {
    public static void helper(String str,int pos,int num)
    {
        if(pos>=num){
            System.out.println(str);
            return;
        }
        if(str.charAt(str.length()-1)=='1')
            helper(str+"0",pos+1,num);
        if(str.charAt(str.length()-1)=='0')
        {
            helper(str+"0",pos+1,num);
            helper(str+"1",pos+1,num);

        }    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        helper("0",1,num);
        helper("1",1,num);

    }
}
