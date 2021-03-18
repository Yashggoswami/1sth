import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet2 {
    public static void getsubset(String st, String ch, int length, int index, ArrayList<String> arr)
    {
        if(index==length){
            arr.add(ch);
            return;
        }
        getsubset(st,ch+st.charAt(index),length,index+1,arr);
        getsubset(st,ch,length,index+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String ch="";
        int n=st.length();
        ArrayList<String> arr=new ArrayList<>();
        getsubset(st,ch,n,0,arr);
        System.out.println(arr);
    }
}
