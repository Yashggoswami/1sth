package Test;

import java.io.IOException;
public class MultiTreading {
    static class multi extends Thread{
        public void run()
        {
            try{

                for(int i=0;i<5;i++){
                    Thread.sleep(1434);
                    System.out.println("thread id is "+Thread.currentThread().getName());
                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        multi ob=new multi();
        ob.run();
//        multi obj=new multi();
//        multi obb=new multi();
//        ob.start();
//        try{
//            ob.join();
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        obj.start();
//        try{
//            obj.join();
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        obb.start();
//        multi[] obj=new multi[n];
//        for(int i=0;i<n;i++)
//        {
//            obj[i]=new multi();
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            obj[i].start();
//        }
    }
}
