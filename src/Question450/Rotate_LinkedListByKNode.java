package Question450;

public class Rotate_LinkedListByKNode {
    Rotate_LinkedListByKNode.Node head;
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

      Node prev=head;

        while(prev.next!=null)
        {
            prev=prev.next;
        }

        prev.next=node;
        node.prev=prev;
    }

    public void display(Node head)
    {
        if(head==null)
            System.out.println("ddl is empty");
        else
        {
          Node prev=head;

            while(prev!=null)
            {
                System.out.print(prev.data+" ");
                prev=prev.next;
            }
            System.out.println();
        }
    }

    public Node rotateNode(Node head,int k)
    {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null)
        {
            if(k>0)
            {
                slow=slow.next;
                k--;
            }
            fast=fast.next;
        }

        slow.prev.next=null;
        slow.prev=null;
        fast.next=head;
        head=slow;



        return head;
    }
    
    public Node reverse(Node head ,int k)
    {
        if(head==null)
            return head;

        int count=k;
        Node fast=head;
        Node slow=null;
        Node temp=null;
        while(fast!=null && count-->0)
        {
            temp=fast.next;
            fast.next=slow;
            fast.prev=temp;
            slow=fast;
            fast=temp;

        }

        if(fast!=null)
            head.next=reverse(fast.next,k);

        return head;
    }

    public static void main(String[] args) {
        Rotate_LinkedListByKNode obj=new Rotate_LinkedListByKNode();
//        {6, 5, 3, 2, 8, 10, 9}
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);
        obj.display(obj.head);
        obj.head=obj.reverse(obj.head,2);
        obj.display(obj.head);
    }
}
