package LinkedList;

import jdk.swing.interop.SwingInterOpUtils;

public class Linked {
    Node head;
    class Node{
        Node next;
        int val;
        Node(){
            next=null;
        }
    }
    Linked(){
        head=null;
    }
    public void add(int val){
        if(head==null){
            Node node=new Node();
            node.val=val;
            head=node;
            head.next=null;
        }
        else if(head.next==null){
            Node temp=new Node();
            temp.val=val;
            head.next=temp;
        }
        else{
            Node node=new Node();
            node.val=val;
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void show(){
        if(head==null){
            System.out.println("empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");

                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked link=new Linked();
        link.add(1);
        link.add(2);
      link.show();
    }
}
