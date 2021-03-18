package Question450;


public class MergeSort{




    public static void main(String[] args)
    {

        System.out.println("Hello yash");
        LinkedList node=new LinkedList();

        node.insert(12);
        node.insert(8);
        node.insert(6);
        node.insert(16);
        node.insert(4);
        node.insert(18);
        node.insert(3);
        node.insert(2);
        node.insert(15);
        node.insert(1);
        node.head=node.Merge(node.head);
        node.display(node.head);

    }






}

class LinkedList{

    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.next=null;
            this.data=data;
        }
    }

    public void insert(int data)
    {
        Node node= new Node(data);
        if(head==null)
        {
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }

    }

    public void display(Node head)
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else{
            Node temp=head;

            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }


    public Node Merge(Node head)
    {

        if(head.next==null)
            return head;

        
        Node middle=head;
        Node last=head.next;

        while(last!=null && last.next!=null)
        {
            last=last.next.next;
            middle=middle.next;
        }

        Node second=middle.next;
        middle.next=null;
        head=Merge(head);
        second = Merge(second);
        Node sortedlist=sortedMerge(head,second);
        return sortedlist;


    }
    Node sortedMerge(Node a, Node b) {
        Node result;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }






































}
