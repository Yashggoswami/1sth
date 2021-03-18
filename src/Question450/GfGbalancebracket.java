package Question450;


import java.util.*;
import java.lang.*;
import java.io.*;

class GfGbalancebracket {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        System.out.println(t);
        for(int q=0;q<t;q++)
        {
            String str=new String();
            str=sc.next();
            Stack<Character> stack=new Stack<>();
            int count=0;
            char[] chararray=str.toCharArray();


            for(char c: chararray)
            {
                if(stack.isEmpty() && c=='}')
                {
                    count++;
                    stack.push('{');
                }
                else if(c=='}'){
                    stack.pop();
                }
                else
                    stack.add(c);
            }
            int j=0;

            while(!stack.isEmpty())
            {
                j++;
                stack.pop();

            }
            if(j%2==0){
                count+=j/2;
                arr[q]=count;}
            else
                arr[q]=-1;



        }
       for(int a:arr)
            System.out.println(a);
    }
}