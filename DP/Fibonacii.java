import java.util.Scanner;

public class Fibonacii{

    public static int[] dp = new int[1000 + 5]; //n <= 1000 , dp[i] = -1 -> un-touched state

    public static int f_td(int n){

        if(n==0 || n==1) return n;
        if(dp[n] != -1) return dp[n];

        //when we are aomputing sub-problem first
        return dp[n] = f_td(n-1) + f_td(n-2);
    } 

    public static int f_bu(int n){
        int[] DP = new int[1000 + 5];

        if(n==0 || n==1) return n;
        DP[0] = 0;
        DP[1] = 1;

        for(int i=2;i<=n;i++){
            DP[i] = DP[i-1] + DP[i-2];
        }

        return DP[n];
    }

    public static int f_bu_opti(int n){

        if(n==0 || n==1) return n;
        int a = 0;
        int b = 1;
        int c = 0;

        int i=2;
        while(i<=n){
            c = a+b;
            a = b;
            b = c;
            i++;
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        for(int i=0;i<1000;i++){
            dp[i] = -1;
        }

        System.out.println(f_bu_opti(12));
    }
}