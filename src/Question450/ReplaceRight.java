package Question450;
import java.util.*;
public class ReplaceRight {
    static Node head;

    static class Node{
        Node left=null;
        Node right=null;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void insert(int val)
    {
        if(head==null)
        {
            head=new Node(val);
        }else{
            Node temp=head;
            Node prev=head;
            while(temp!=null)
            {
                prev=temp;
                if(temp.data>val)
                    temp=temp.left;
                else
                    temp=temp.right;
            }
            if(prev.data>val)
                prev.left=new Node(val);
            else
                prev.right=new Node(val);
        }


    }
    public static void main(String[] args) {
        int[] arr={8, 58, 71, 18, 31, 32, 63, 92,
                43, 3, 91, 93, 25, 80, 28};

        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]);
        }


    }
}
