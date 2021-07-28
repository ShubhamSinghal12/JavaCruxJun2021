package Lec16;

import java.util.ArrayList;
import java.util.Arrays;

public class Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,5,2,4,2,6};
		int ele = 2;
//		System.out.println(lOc(arr,2,ele,-1));
//		printAllOc(arr, 0, ele);
		ArrayList<Integer> al = new ArrayList<Integer>();
		StoreAllOc(arr, 0, ele, al);
		System.out.println(al);
		
		int[] ans = StoreAllOc(arr, 0, ele, 0);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int fOc(int[] arr,int id,int ele)
	{
		if(id == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[id] == ele)
				return id;
			else
				return fOc(arr,id+1,ele);
		}
	}
	
	public static int lOc(int[] arr,int id,int ele,int ans)
	{
		if(id == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[id] == ele)
				ans = id;
			
			return lOc(arr,id+1,ele,ans);
		}
	}
	
	public static void printAllOc(int[] arr,int id,int ele)
	{
		if(id == arr.length)
		{
			return;
		}
		else
		{
			if(arr[id] == ele)
				System.out.println(id);
			
			printAllOc(arr,id+1,ele);
		}
	}
	
	public static void StoreAllOc(int[] arr,int id,int ele,ArrayList<Integer> ans)
	{
		if(id == arr.length)
		{
			return;
		}
		else
		{
			if(arr[id] == ele)
				ans.add(id);
			
			StoreAllOc(arr,id+1,ele,ans);
		}
	}
	
	public static int[] StoreAllOc(int[] arr,int id,int ele,int count) {
		if(id == arr.length)
		{
			int[] ans = new int[count];
			return ans;
		}
		else
		{
			if(arr[id] == ele)
			{
				count++;
			}
			
			int[] index_Array = StoreAllOc(arr, id+1, ele, count);
			if(arr[id] == ele)
			{
				index_Array[count-1] = id;
			}
			return index_Array;
		}
	}
	
	
	

}
