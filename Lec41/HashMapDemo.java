package Lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 20);
		map.put("Vishal", 15);
		map.put("Amit", 25);
		map.put("Shubham", 30);
		map.put(null, null);
		
		
		System.out.println(map);
		
		map.put("Ram",30);
		map.put(null, 10);
		
		System.out.println(map);
		
		System.out.println(map.get("ram"));
		
//		System.out.println(map.remove("Ram"));
//		System.out.println(map);
		
		System.out.println(map.containsKey("Amit"));
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String val: keys)
		{
			System.out.println(val+" : " + map.get(val));
		}
		System.out.println("----------------------");
		for(String val: map.keySet())
		{
			System.out.println(val+" : " + map.get(val));
		}
		System.out.println("----------------------");
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		for(String val: al)
		{
			System.out.println(val+" : " + map.get(val));
		}
		
		TreeMap<String,Integer> map1 = new TreeMap<>();
		
		map1.put("Ram", 20);
		map1.put("Vishal", 15);
		map1.put("Amit", 25);
		map1.put("Shubham", 30);
//		map1.put(null, null);
		
		
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		
		map2.put(null, null);
		map2.put("Ram", 20);
		map2.put("Vishal", 15);
		map2.put("Amit", 25);
		map2.put("Shubham", 30);
		
		System.out.println(map2);
	}

}
