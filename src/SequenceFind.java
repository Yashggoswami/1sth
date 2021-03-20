import java.util.Scanner;

public class SequenceFind {


    public static int find(String str, String pattern, int m, int n)
    {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }


        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {   if(str.charAt(i - 1) == pattern.charAt(j - 1))
                {
                  dp[i][j]=dp[i-1][j-1];
                }else
                {
                    dp[i][j]=0;
                }
                dp[i][j] +=dp[i - 1][j];
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();//        if(str.equalsIgnoreCase(pattern))
//            System.out.println(0);
        String pattern = sc.nextLine();
        if(str.equalsIgnoreCase(pattern))
            System.out.println(0);
        else
        System.out.print(find(str,pattern, str.length(), pattern.length()));
    }
}

