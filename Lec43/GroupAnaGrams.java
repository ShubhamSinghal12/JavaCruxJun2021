package Lec43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class GroupAnaGrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat","tab"};
		System.out.println(groupAnagrams(strs));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
    
		ArrayList<List<String>> ans = new ArrayList<>();
		
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		
		for(int i = 0; i < strs.length; i++)
		{
			char[] cstr = strs[i].toCharArray();
			Arrays.sort(cstr);
//			String str = new String(cstr);
			String str = String.valueOf(cstr);
//			System.out.println(str);
			if(!map.containsKey(str))
			{
				map.put(str, new ArrayList<String>());
			}
			map.get(str).add(strs[i]);			
		}
		
//		System.out.println(map);
		for(String val:map.keySet())
		{
			ans.add(map.get(val));
		}
		
		return ans;
    }

}
