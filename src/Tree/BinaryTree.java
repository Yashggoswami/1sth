package Tree;
import java.util.*;
class Node{
    int val;
    Node left,right;
    Node(int x){
        this.val=x;
        left=right=null;
    }
    Node(){
        left=right=null;
    }

}
public class BinaryTree {
    Node root;
    BinaryTree(int x)
    {
        root=new Node(x);
    }
    public void InsertNode(int temp){
        Node root=Insert(this.root,temp);
    }
    public Node Insert(Node root,int temp){
        if(root==null)
        {
           return new Node(temp);

        }
        if(temp<=root.val)
        {
            root.left=Insert(root.left,temp);
        }
        else{
            root.right=Insert(root.right,temp);
        }
        return root;
    }
    public void order(List<Integer>list)
    {   preorder(this.root,list);
        //inorder(this.root,list);
//        postorder(this.root,list);
    }
    public void delete(int temp){
        Node  node=deleteNode(this.root,temp);
    }
    public Node deleteNode(Node root,int temp)
    {
        if(root==null) return null;

        if(root.val>temp){
            root.left=deleteNode(root.left,temp);
        }
        else if(root.val<temp){
            root.right=deleteNode(root.right,temp);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            root.val=minval(root.right);
            root.right=deleteNode(root.right,root.val);

        }
        return root;
    }

    public int minval(Node root){
        int min=root.val;
        while(root.left!=null){
            root=root.left;
            min=root.val;
        }
        return min;
    }
    public void preorder(Node root,List<Integer> list)
    {
        if(root==null) return;

        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);

    }
    public List<List<Node>> levelorder()
    {
        List<List<Node>> list=new ArrayList<>();
        if(this.root==null) return null;
        List<Node> l=new ArrayList<>();
        l.add(root);
        list.add(l);
        for(int i=0;i<list.size();i++)
        {   List<Node> q=new ArrayList<>();
            for(int j=0;j<list.get(i).size();j++)
            {
                root=list.get(i).get(j);
            if(root.left!=null)
            {
                q.add(root.left);
            }
            if(root.right!=null)
            {
                q.add(root.right);
            }
            }
            if(q.size()>0) list.add(q);
        }
//        for(int i=0;i<list.size();i++){
//            root=list.get(i);
//            if(root.left!=null)
//            {
//                list.add(root.left);
//            }
//            if(root.right!=null)
//            {
//                list.add(root.right);
//            }

//        }
        return list;
    }
    public void inorder(Node root,List<Integer> list)
    {
        if(root!=null)
        {
            if(root.left!=null)
                inorder(root.left,list);
            list.add(root.val);
            if(root.right!=null)
                inorder(root.right,list);
        }
    }
    public void postorder(Node root,List<Integer> list)
    {
        if(root!=null){
            if(root.left!=null)
                postorder(root.left,list);
            if(root.right!=null)
                postorder(root.right,list);
            list.add(root.val);
        }
    }

    public static void main(String[] args) {
        BinaryTree b=new BinaryTree(8);
        b.InsertNode(4);
        b.InsertNode(10);
        b.InsertNode(3);
        b.InsertNode(5);
        List<Integer> list=new ArrayList<>();
//        b.order(list);
//        for(Integer a:list)
//        {
//            System.out.println(a);
//        }
//        b.delete(3);
//        List<Integer> list1=new ArrayList<>();
//        b.order(list1);
//        for(Integer a:list1)
//        {
//            System.out.println(a);
//        }
        List<List<Node>> l=b.levelorder();
        for(List<Node> q:l){
            for(Node a:q){System.out.print(a.val+" ");}
            System.out.println();
        }

    }
}

