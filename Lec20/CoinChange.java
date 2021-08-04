package Lec20;

public class CoinChange {

	 public static void main(String[] args) {
			
			int[] coins = {2,3,5,7};
			StringBuilder st = new StringBuilder(); 
//			coinChangeComb(coins,0,10,st,0);
			coinChangeCombCoinRespect(coins, 10, "", 0);
		}
	 
		public static void coinChange(int[] coins,int sumSoFar,int sum,StringBuilder ans) {
			if(sumSoFar==sum) {
				System.out.println(ans);
			} else if(sumSoFar>sum){
				return;
			} else {
				for(int i=0;i<coins.length;i++) {
//					sumSoFar += coins[i];
					ans.append(coins[i]);
					ans.append(' ');
					coinChange(coins,sumSoFar+coins[i],sum,ans);
					ans.delete(ans.length()-2,ans.length());
//					sumSoFar -= coins[i];
				}
			}
		}
		
		public static void coinChangeComb(int[] coins,int sumSoFar,int sum,StringBuilder ans,int lastIndex) {
			if(sumSoFar==sum) {
				System.out.println(ans);
			} else if(sumSoFar>sum){
				return;
			} else {
				for(int i=lastIndex;i<coins.length;i++) {
//					sumSoFar += coins[i];
					ans.append(coins[i]);
					ans.append(' ');
					coinChangeComb(coins,sumSoFar+coins[i],sum,ans,i);
					ans.delete(ans.length()-2,ans.length());
//					sumSoFar -= coins[i];
				}
			}
		}
		
		public static void coinChangeCombCoinRespect(int[] coins,int sum,String ans,int coin)
		{
			if(sum == 0)
			{
				System.out.println(ans);
			}
			else if(sum < 0 || coin >= coins.length)
			{
				return;
			}
			else
			{
				coinChangeCombCoinRespect(coins, sum-coins[coin], ans+coins[coin]+" ", coin);
				
				coinChangeCombCoinRespect(coins, sum, ans, coin+1);
			}
		}
		
		
}
