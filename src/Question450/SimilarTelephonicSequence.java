package Question450;
import java.util.*;
public class SimilarTelephonicSequence {
    static int[] directory=new int[26];
    static{
        int q=0;
        for(int i=2;i<=6;i++)
        {   int v=i;
            for(int j=0;j<3;j++)
            {
                directory[q++]=v;
                v=v*10+i;
            }
        }
        for(int i=0;i<4;i++)
            directory[q++]=7;

        for(int i=0;i<3;i++)
            directory[q++]=8;

        for(int i=0;i<4;i++)
            directory[q++]=9;

    }
    public static void main(String[] args) {
     String str=new String();
     Scanner sc=new Scanner(System.in);
     str=sc.nextLine();
    StringBuilder st=new StringBuilder();
         for(char c:str.toCharArray())
         {
             if(c-'A'<16 || (c-'A'>=20 && c-'A'<23))
             {
                 for(int i=0;i<=(c-'A')%3;i++)
                     st.append(directory[c-'A']);
             }else if((c-'A'>=16 && c-'A'<=19) || (c-'A'>22 && c-'A'<26))
             {
                 for(int i=0;i<=(c-'A')%5;i++)
                     st.append(directory[c-'A']);
             }
         }
        System.out.println(st);
    }
}
//4333355777733366677743333557777
//4333355777733366677743333557777
//4333355777733366677743333557777