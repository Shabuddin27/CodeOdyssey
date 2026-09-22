package dsa;

public class ClimbingStairs {
    public static void main(String args[]){

        int n =7;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        if(n==1){
            System.out.println(dp[1]);
        }
        if (n==2){
            System.out.println(dp[2]);
        }
        for(int i=3;i<=n;i++){
           dp[i] = dp[i-1] + dp[i-2];
        }
        for (int j=1;j<=n;j++){
            System.out.println("Stair: "+ j + " ways: " + dp[j]);
        }

    }
}
