package Test;
import java.util.*;
import java.io.*;

public class FastReader{
    BufferedReader br;
    StringTokenizer st;
    FastReader() throws IOException
    {
        br=new BufferedReader(new FileReader("/home/yash/IdeaProjects/1sth/src/Test/input.txt"));
    }

    String next()
    {    while(st==null || !st.hasMoreElements())
        {
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }
    long parseLong()
    {
        return Long.parseLong(next());
    }
    double parseDouble()
    {
        return Double.parseDouble(next());
    }
    float parseFloat()
    {
        return Float.parseFloat(next());
    }
}

// FastReader sc=new FastReader();
// int n=sc.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++)
// {
//      arr[i]=sc.nextInt();
// }

