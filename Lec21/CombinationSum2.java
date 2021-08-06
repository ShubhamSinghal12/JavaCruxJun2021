package Lec21;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candidate[] = {10,1,2,7,6,1,5};
		int target = 8;
		Arrays.sort(candidate);
		cs2(candidate, "", target, 0);
		
		List<Integer> al = new ArrayList<>();
		List<List<Integer>> Bigans = new ArrayList<>();
		cs2List(candidate, al, target, 0, Bigans);
		System.out.println(Bigans);
	}
	
	public static void cs2(int[] coins,String ans,int target,int idx)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i=idx;i<coins.length;i++) {
				if(i == idx || coins[i]!=coins[i-1]) {
					if(coins[i] <= target) {
						cs2(coins,ans+coins[i],target-coins[i],i+1);
					}
				}
			}
		}
	}
	
	public static void cs2List(int[] coins,List<Integer> ans,int target,int idx,List<List<Integer>> Bigans)
	{
		if(target == 0)
		{
			Bigans.add(new ArrayList<>(ans));
		}
		else
		{
			for(int i=idx;i<coins.length;i++) {
				if(i == idx || coins[i]!=coins[i-1]) {
					if(coins[i] <= target) {
						ans.add(coins[i]);
						cs2List(coins,ans,target-coins[i],i+1,Bigans);
						ans.remove(ans.size()-1);
					}
				}
			}
		}
	}
	
}
