import java.util.Scanner;

public class Fibonacii{

    public static int[] dp = new int[1000 + 5]; //n <= 1000 , dp[i] = -1 -> un-touched state

    public static int f_td(int n){

        if(n==0 || n==1) return n;
        if(dp[n] != -1) return dp[n];

        //when we are aomputing sub-problem first
        return dp[n] = f_td(n-1) + f_td(n-2);
    } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        for(int i=0;i<1000;i++){
            dp[i] = -1;
        }

        System.out.println(f_td(10));
    }
}