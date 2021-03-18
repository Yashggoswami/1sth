import java.util.*;
import java.util.Set;
public class powerSet {
    public static void findset(char[] ch,ArrayList<String> set,int index,int n,ArrayList<ArrayList<String>> powerset)
    {
        if(index==n) return;
        powerset.add(new ArrayList<>(set));
        for(int i=index+1;i<n;i++)
        {
            set.add(String.valueOf(ch[i]));
            findset(ch,set,i,n,powerset);
            set.remove(set.size()-1);
        }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        ArrayList<ArrayList<String>> powerset=new ArrayList<>();
        findset(ch,new ArrayList<>(),-1,ch.length,powerset);
        System.out.println(powerset);
    }
}
