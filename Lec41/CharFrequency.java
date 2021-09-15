package Lec41;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcbdebfeacdskjhgskjf";
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(); 
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
//			if(map.containsKey(ch))
//			{
//				map.put(ch, map.get(ch)+1);
//			}
//			else
//			{
//				map.put(ch, 1);
//			}
		}
		System.out.println(map);
		for(char key: map.keySet())
		{
			System.out.println(key+" : "+map.get(key));
		}

	}

}
