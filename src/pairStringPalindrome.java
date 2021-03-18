import java.util.*;
public class pairStringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        int i=0;

        while(sc.hasNext())
        {
            str[i]=sc.next(); i++;
        }
//        for(String s:str)
//  {         System.out.println(s);
//       }

        for(int j=0;j<str.length-1;j++){
            for(int k=j+1;k<str.length;k++)
            {
                String st=str[j]+str[k];
                if(isPalindrome(st)){
                    System.out.println(st);
                }
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
