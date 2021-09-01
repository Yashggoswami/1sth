package packageone;

public class firstonly{
    protected static int temp = 3;
    private static int tqq = 3;
    public static int tem = 3;
    firstonly(){
        temp = 2;
    } 
    public static void main(String[] args) {
        // System.out.println("temp value is "+temp)
        firstttt f = new firstttt();
        f.firstttt();
    }
}

class firstttt{
    public void finalize(){
        System.out.println("garbage is collected.");
    }
    void firstttt()
    {
        int temp = 0;
        fun1(temp);
        //call by value not by reference
         firstttt t = new firstttt();
        // 2. assigning one reference variable to other reference variable
        firstttt t = new firstttt();
        firstttt q = new firstttt();
        t = q;
        System.out.println(temp);
        System.gc();
    }

    void fun1(int temp)
    {   temp = 2;
        System.out.println(temp);

    }
}

          //class itself | package same | package different
// private      yes      |     no       |  no
// default      yes      |    yes       |  no
// protected    yes      |    yes       |  yes (subclass of extending class)
// public                       YES


// types of variables in java
// 1. local variable
// 2. Instance variable
// 3. static variable
// 4. Global variable (public static variable)


