package Question450;

public class subsequenence {
    static int count=0;
    static int countPS(char[] str)
    {
        // Your code here
        count = str.length;

        findsubsequence(0,str.length-1,str);
        return count;

    }
    public static void findsubsequence(int i,int j,char[] str)
    {
        if(i>=j)
            return;
        if(ispalindrome(str,i,j))
            count++;
        System.out.println(count);
        findsubsequence(i+1,j,str);
        findsubsequence(i,j-1,str);
//        findsubsequence(i+1,j-1,str,count);

    }

    public static boolean ispalindrome(char[] str,int i,int j)
    {
        while(i<=j)
            if(str[i]!=str[j])
                return false;
            else{
                i++;j--;
            }

        return true;
    }

    public static void main(String[] args) {
        String str="aad";
        char[] arr=str.toCharArray();
        System.out.println(countPS(arr));
    }
}