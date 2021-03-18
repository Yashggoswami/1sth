package Question450;

import java.math.BigInteger;

public class RabinKarp {
    public static void main(String[] args){

        String str= "ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabaaabbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb";
        String pattern="abbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbba";
        BigInteger hashval=BigInteger.valueOf(0);
        BigInteger temp=BigInteger.valueOf(0);

        if(str.length()<pattern.length())   return;

        for(int i=0;i<pattern.length();i++)
            {
                hashval=hashval.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(pattern.charAt(i)-'a'));
                temp=temp.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(str.charAt(i)-'a'));
            }

        if(temp.equals(hashval))
            System.out.println("mil gya index 0 pe");

        for(int i=1;i+pattern.length()-1<str.length();i++)
            {
    //            BigInteger.valueOf((long) ((str.charAt(i - 1) - 'a') * Math.pow(10, pattern.length() - 1)))
                temp = temp.subtract(BigInteger.valueOf(str.charAt(i-1)-'a').multiply(BigInteger.valueOf(10).pow(pattern.length()-1))).multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(str.charAt(i + pattern.length() - 1) - 'a'));
    //            System.out.println(temp);
                if(temp.equals(hashval))
                    System.out.println("mila hai index "+i+" pe");
            }

    }
}
