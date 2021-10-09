package Lec53;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine {

	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int boys[] = new int[n];
      for(int i=0;i<n;i++){
          boys[i]=sc.nextInt();
      }
      int girls[] = new int[m];
      for(int i=0;i<m;i++){
          girls[i]=sc.nextInt();
      }
      Arrays.sort(boys);
      Arrays.sort(girls);

      int[][] dp = new int[n][m];
      for(int[] arr: dp)
    	  Arrays.fill(arr, -1);
     System.out.println(recursion(boys,girls,0,0,dp));
    }
    public static int recursion(int[] boys,int[] girls,int i,int j ){
        if(i==boys.length)
        {
            return 0;
        }

        if(j==girls.length){
            return 10000000;
        }

        return Math.min(Math.abs(boys[i]-girls[j])+recursion(boys,girls,i+1,j+1),recursion(boys,girls,i,j+1));
    }
    
    public static int recursion(int[] boys,int[] girls,int i,int j ,int[][] dp){
        if(i==boys.length)
        {
            return 0;
        }

        if(j==girls.length){
            return 10000000;
        }
        if(dp[i][j] != -1)
        	return dp[i][j];

        return dp[i][j] = Math.min(Math.abs(boys[i]-girls[j])+recursion(boys,girls,i+1,j+1),recursion(boys,girls,i,j+1));
    }

}
