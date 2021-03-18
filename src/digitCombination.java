import java.util.*;

public class digitCombination {
    public static void helper(String st,int start,int end,int n,Set<String> set)
    {  // if(n==1){
//        System.out.println(st.substring(start,end+1));
//
//        return; }
        if(n<=0) return;
        set.add(st.substring(start,end+1));
        helper(st,start+1,end,n-1,set);
        helper(st,start,end-1,n-1,set);
        helper(st,start+1,end-1,n-2,set);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        Set<String> set=new HashSet<>();
        helper(st,0,st.length()-1,st.length(),set);
        System.out.println(set);
    }
}
