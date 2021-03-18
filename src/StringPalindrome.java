import java.util.*;

public class StringPalindrome {

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String str=new String();
    System.out.println("Enter the String");
    str=sc.nextLine();
    ArrayList<ArrayList<String>> result=new ArrayList<>();
    partitionString(str,result,new ArrayList<String>());
    for(ArrayList<String> i:result)
    {
        for(String j:i){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void partitionString(String str, ArrayList<ArrayList<String>> result, ArrayList<String> temp){
    if(str.length()==0)
    {
        result.add(new ArrayList<>(temp));
    }

    for(int i=0;i<str.length();i++)
    {
        String leftpar=str.substring(0,i+1);
        if(isPalindrome(leftpar))
        {
            temp.add(leftpar);
            partitionString(str.substring(i+1),result,temp);
            temp.remove(temp.size()-1);
        }

    }
}
public static boolean isPalindrome(String str)
{
    int len=str.length()-1;
    for(int i=0;i<len;i++)
    {
        if(str.charAt(i)!=str.charAt(len)) return false;

        len--;
    }
    return true;
}
}
