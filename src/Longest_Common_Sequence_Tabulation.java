import java.util.Arrays;
public class Longest_Common_Sequence_Tabulation {
    static int memo[][];
   public  static int lcs(String s1, String s2) {
       int x = s1.length(), y = s2.length();
       int dp[][] = new int[x+1][y+1];
       for(int i=1; i<=x; i++)
       {
           for(int j=1; j<=y; j++)
           {
               if(s1.charAt(i-1)==s2.charAt(j-1))
                   dp[i][j] = 1 + dp[i-1][j-1];
               else
                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
           }
       }
       return dp[x][y];
   }










    public static void main(String[] args) {
        String s1="AXYZ", s2="BAZ";
        System.out.println(lcs(s1,s2));  //2
    }
}
