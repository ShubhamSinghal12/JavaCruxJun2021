package Lec41;

import java.util.HashMap;
//import java.util.LinkedHashMap;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5,8,1,2,5,7,8,10};
		int[] arr2 = {8,1,9,10,5,6,7,5,5,4,2};
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr1.length ; i++)
		{
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
		}
		System.out.println(map);
		
		for(int i = 0; i < arr2.length ; i++)
		{
			if(map.containsKey(arr2[i]) && map.get(arr2[i]) > 0)
			{
				System.out.println(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}

	}

}
