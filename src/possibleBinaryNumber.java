import java.util.*;
public class possibleBinaryNumber {
    public static void helper(int[] ch,int deff,int start,int end,int num,ArrayList<Integer> list)
    {    if(Math.abs(deff)>(end-start+1)/2) return;
        if(start>=end && num%2!=0 && deff<1){
            ch[start]=0;
           for(int c:ch){
               System.out.print(c);

           }
            System.out.println();
            ch[start]=1;
            for(int c:ch){
                System.out.print(c);

            }
            System.out.println();





        }
        if(start>end )
        {   if(deff==0){

            for(int c:ch){
                System.out.print(c);

            }
            System.out.println();

        }
        }



        ch[start]=1;
        ch[end]=0;
        helper(ch,deff+1,start+1,end-1,num,list);

        ch[start]=0;
        ch[end]=0;
        helper(ch,deff,start+1,end-1,num,list);

        ch[start]=1;
        ch[end]=1;
        helper(ch,deff,start+1,end-1,num,list);

        ch[start]=0;
        ch[end]=1;
        helper(ch,deff-1,start+1,end-1,num,list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ch=new int[num];

        ArrayList<Integer> list=new ArrayList<>();
        helper(ch,0,0,num-1,num,list);
//        for (int s:list
//             ) {
//            System.out.println(s);
//        }
    }
}
