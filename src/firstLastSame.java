import java.util.*;

public class firstLastSame {
    public static void helper(String st,int i,int j,int n,Set<String> set)
    {
        if(n==1){
            set.add(st.substring(i,j+1));
            return;
        }
        if(n<=0){
            return;
        }
//       if(st.charAt(i)==st.charAt(j)){
           set.add(st.substring(i,j+1));
//       }
       helper(st,i+1,j,n-1,set);
        helper(st,i,j-1,n-1,set);
        helper(st,i+1,j-1,n-2,set);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Set<String> set=new HashSet<String>();
       helper(str,0,str.length()-1,str.length(),set);
        System.out.println(set);
    }
}
