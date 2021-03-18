package LinkedList;

public class MyLinkedList {
    int size;
    Node head;
    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int x){
            this.next=null;this.prev=null;this.val=x;
        }
    }
    public MyLinkedList(){
        size=0;
        head=null;
    }
    public int get(int index){
        if(size-1<index){
            return -1;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            return temp.val;
        }
    }
    public void add(int val,int index){
        Node node=new Node(val);
        if(head==null){
            head=node;size++;
        }
        else{
            Node temp=head;
            if(size-1<index){
                return;
            }
            else{

                for(int i=0;i<index;i++)
                {
                    temp=temp.next;
                }
                node.next=temp.next;
                node.prev=temp;
                size++;
            }

        }
    

    }
    public void show(){
        if(size<=0){
            return;
        }
        else{
         Node temp=head;
         for(int i=0;i<size;i++){
             System.out.println(temp.val+" ");
             temp=temp.next;
         }
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedlist=new MyLinkedList();
        linkedlist.add(2,0);
        linkedlist.add(4,1);
        System.out.println(linkedlist.get(1));

        linkedlist.show();
    }

}
