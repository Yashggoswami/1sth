package Test;

import java.util.ConcurrentModificationException;

public class MultithreadingRunnable {
    static class demo implements Runnable{
        public void run()
        {
            try{
                System.out.println(" thread id is (Runnable interface) "+Thread.currentThread().getId());
//                throw new ConcurrentModificationException("ye hai error");
            }
            finally {
                System.out.println("in finally block");
            }
        }

        public static void main(String arg[])
        {
            Thread t=new Thread(new demo());
            t.start();
        }
    }
}
