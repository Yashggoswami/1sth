

public class favronacci {
    static int fp = 1;
    static int fun ( int n)
    {
        System.out.println(fp);
        int t, f;

        if ( n <= 1 )
        {
            fp = 1;
            return 1;
        }
        t = fun ( n - 1);
        System.out.println(fp);
        System.out.print(n+" "+fp+" "+t);

        f = t + fp;
        fp = t;
        System.out.print(" "+f);
        System.out.println();
        return f;
    }
    public static void main (String[] args)
    {
        System.out.println(fun(5));
    }
}
