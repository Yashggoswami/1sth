package ExceptionHandling;

import java.util.ConcurrentModificationException;

public class DemoClass1 {
    public static void main(String[] args) throws ConcurrentModificationException {
        try{
            main(new String[]{"yash"});
            double q=0.12;
//            Integer i=Integer.parseInt("");
            System.out.println(10/q);
        }
//        catch(NumberFormatException e){
//            System.out.println(e);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }catch(RuntimeException e)
//        {
//            System.out.println(e);
//        }
        finally {
            System.out.println("block inside finally");
        }
    }
}
