public class FibonacciSeries_Recurison {


    static int fun(int n){
        if(n==1||n==0){
            return n;
        }
        return(fun(n-1)+fun(n-2));
    }
    public static void main(String[] args) {
        System.out.println(fun(5));

    }
}
