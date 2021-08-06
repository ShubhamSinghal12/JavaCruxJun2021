package Lec21;

import java.util.ArrayList;

import	java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,5,7};
		int target = 10;
		List<Integer> al = new ArrayList<>();
		List<List<Integer>> Bigans = new ArrayList<>();
		targetSum(candidates, al, target, 0,Bigans);
		System.out.println(Bigans);
		
	}
	
	 public static void targetSum(int[] ques, List<Integer> ans, int target,int idx,List<List<Integer>> Bigans) {
			if(target == 0) {
				Bigans.add(new ArrayList<>(ans));
			}
			else {
				for(int i=idx;i<ques.length;i++) {
					if(ques[i] <= target) {
						ans.add(ques[i]);
						targetSum(ques, ans , target-ques[i],i,Bigans);
						ans.remove(ans.size()-1);
					}
				}
			}
		}

}
