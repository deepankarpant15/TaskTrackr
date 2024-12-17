package prac;

public class esdd {
    public static void main(String[] args) {
    	int size =25;
        int[] arr = {9,15,7,14,8};
        int[] val = {80,40,60,20,100};
        
        System.out.println(maxLot(size,arr,val));
        
    }

      public static int maxLot(int m, int[] wts, int[] val) {
            int n = wts.length;
            int[][] dp = new int[n + 1][m + 1];

            for (int i = 1; i <= n; i++) {
                for (int w = 1; w <= m; w++) {
                    if (wts[i - 1] <= w) {
                        dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wts[i - 1]], dp[i - 1][w]);
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }

            return dp[n][m];
        }
    }