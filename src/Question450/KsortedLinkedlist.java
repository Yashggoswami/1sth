package Question450;
import java.util.*;

public class KsortedLinkedlist {

    Queue<Node> queue=new PriorityQueue<>( new Comparator<Node>() {
        @Override
        public int compare(Node node, Node t1) {
            return node.data-t1.data;
        }
    });

    Node head;
    class Node{
        Node next=null;
        Node prev=null;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public void insert(int data)
    {
        Node node=new Node(data);

        if(head==null){
            head=node;
            return;
        }

        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=node;
        node.prev=temp;
    }

    public void display(Node head)
    {
        if(head==null)
            System.out.println("ddl is empty");
        else
        {
            Node temp=head;

            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public Node k_sorted_ddl(Node head,int k)
    {

        Node temp=head;
        Node node=null;
        Node temp1;
        while(temp!=null)
        {
            if(queue.size()>k) {
                temp1 = queue.poll();
                if (node == null) {
                    head = temp1;
                    node = head;
                } else {
                    head.next = temp1;
                    temp1.prev = head;
                    head = temp1;
                }
            }
            queue.add(temp);
            temp=temp.next;

        }
        while(queue.size()>0)
        {
            head.next=queue.remove();
            head.next.prev=head;
            head=head.next;
        }
        head.next=null;
        return node;
    }
    public static void main(String[] args) {
        KsortedLinkedlist obj=new KsortedLinkedlist();
//        {6, 5, 3, 2, 8, 10, 9}
        obj.insert(6);
        obj.insert(5);
        obj.insert(3);
        obj.insert(2);
        obj.insert(8);
        obj.insert(10);
        obj.insert(9);
        obj.display(obj.head);
        obj.head=obj.k_sorted_ddl(obj.head, 3);
        obj.display(obj.head);

    }
}
