import java.util.*;
public class NoRepeat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<size;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],0);
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(map.get(arr[i])==1){
                flag=true;
                System.out.println(arr[i]);
                break;
            }
        }
        if(flag==false)
            System.out.println(-1);

    }
}



