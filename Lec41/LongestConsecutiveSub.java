package Lec41;

import java.util.HashMap;

public class LongestConsecutiveSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,1,7,9,4,2,10,5};
		System.out.println(longestConsecutive(arr));

	}
	
	public static int longestConsecutive(int[] nums) {
        
		int ans = 1;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i < nums.length; i++)
		{
			if(map.containsKey(nums[i]-1))
			{
				map.put(nums[i], false);
			}
			else
			{
				map.put(nums[i], true);
			}
			
			if(map.containsKey(nums[i]+1))
			{
				map.put(nums[i]+1,false);
			}
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			if(map.get(nums[i]))
			{
				int count = 0;
				int k = nums[i];
				while(map.containsKey(k))
				{
					count++;
					k++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
    }

}
