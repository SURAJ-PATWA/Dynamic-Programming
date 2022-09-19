import java.util.Arrays;

public class Longest_Common_Subsequence_Recurison {
    static int[][] memo;


  public   static int lcs(String s1, String s2, int n, int m){
      if(m==1||n==0)return 0;
      if(s1.charAt(n-1)==s2.charAt(m-1)){
          return 1+lcs(s1,s2,n-1,m-1);
      }
      else{
          return Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
      }
  }


    public static void main(String[] args) {
        String s1="AXYZ", s2="BAZ";
        int n = 4, m = 3;
        memo= new int[n+1][m+1];
        for(int[] i: memo)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(lcs(s1,s2,n,m));
    }
}
