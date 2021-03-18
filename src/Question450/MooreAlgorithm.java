package Question450;
import java.util.*;

public class MooreAlgorithm {
    public static Map<Character,Integer> generateBadCharTable(String pattern,int length)
    {
        Map<Character,Integer> map=new HashMap<>();
        map.put('*',length);
        map.put(pattern.charAt(length-1),length);

        for(int i=length-2;i>=0;i--)
            if(!map.containsKey(pattern.charAt(i)))
                map.put(pattern.charAt(i),length-i-1);


        return map;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String pattern=sc.next();
        String str=sc.next();
        int length=pattern.length();
        int str_length=str.length();
        System.out.println(str);
        HashMap<Character,Integer> table= (HashMap<Character,Integer>) generateBadCharTable(pattern,pattern.length());
        int location=-1;
        int p1=0;
        int p2=length-1;
        for(Map.Entry<Character,Integer> ob: table.entrySet())
        {
            System.out.println(ob.getKey()+" "+ob.getValue());
        }
//        while(p2<str_length)
//        {
//            while(p2-p1>=0 && str.charAt(p2)==pattern.charAt(p2-p1))
//            {
//                p2--;
//            }
//            if(p2-p1<0){location=p1;break;}
//
////            if(table.containsKey(pattern))
//
//        }
//
        if(location>=0)
            System.out.println("pattern found at "+location);
        else
            System.out.println("no pattern match");
    }
}
//
//    AABA
//            AABAACAADAABAABA