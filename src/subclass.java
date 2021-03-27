interface superInterface1{
    void fun(String s);
}
interface superInterface{
    int b=9;
    static void fun(){
        System.out.println("in static fun");
    }
    void fun1();
    int fun2(int d);

}
abstract class superclassA implements superInterface,superInterface1{
    superclassA()
    {
        System.out.println("in super");
    }


    public void fun1(){
        System.out.println("in superclassA fun1");
    }
    public void fun(String s)
    {
        System.out.println("inside abstract class");
    }
}


public class subclass extends superclassA{
    @Override
    public void fun(String s) {
        //super.fun(s);
        System.out.println("override hoke aaya hai");
    }

    public int fun2(int d)
    {
        return superInterface.b;
    }

    public static void main(String[] args) {
        superclassA obj=new subclass();
        obj.fun("yash");
        superInterface.fun();
        obj.fun1();
        System.out.println(obj.fun2(12));
    }
}
