import java.util.*;
public class FibonacciSeries_Memorization {
    static int[] memo;
   public  static int fib(int n){
       if(memo[n]==-1){
           if(n==0||n==1) return n;
            else{
                memo[n]=fib(n-1)+fib(n-2);
           }
       }
       return memo[n];
   }


    public static void main(String[] args) {
        int n = 10;

         memo = new int[n+1];

        Arrays.fill(memo,-1);

        System.out.println(fib(n));
    }
}
