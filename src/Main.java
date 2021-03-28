//
//interface Q{
//    void thu();
//}
//interface Hai{
//    void kya();
//}
//
//interface Hi{
//    void kya();
//}
//interface we extends Q,Hai,Hi{
//    void kya();
//}
//class A implements we{
//    A(){
//        System.out.println("in A constructor");
//    }
//    public void thu(){
//        System.out.println("thu");
//    }
//    public void kya(){
//        System.out.println("kuch nhi");
//    }
//    public void fun(int a)
//    {
//        System.out.println(a);
//    }
//}
//class B extends A{
//    B(){
//        System.out.println("in B constructor");
//    }
//
//    @Override
//    public void fun(int a) {
//        System.out.println("ye overriden a hai");
//    }
//}
//class C extends B{
//    private final int b;
//    private static final int c;
//    static{
//        c=19;
//        System.out.println("C ka block");
//    }
//    C(){
//        this.b=10;
//        System.out.println("kya hai");
//    }
//
//}
//public class Main extends C{
//    static{
//        System.out.println("in static block");
//    }
//    Main(){
//
//        System.out.println("in Main contructor");
//    }
//
//    public static final void main(String[] args) {
//        A m=new Main();
//        m.fun(12);
//        Hai q=new Main();
//        q.kya();
//        Q qw=new Main();
//        qw.thu();
//    }
//}

public class Main{
    public void dis(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
    Integer t=null;
    int x=10;
    int y=5;
        System.out.println(x+++y);
//    t.dis();
//        int[] x = {1,2, 3, 4};
//
//        int[] y = x;
//
//        x = new int[2];
//
//        for (int i = 0; i< x.length; i++) {
//            System.out.println(y[i]+" ");
//
//        }
    }
}
