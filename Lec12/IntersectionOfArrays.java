package Lec12;

import java.util.ArrayList;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,3,4,4,5,6,8,8,8,8};
		int[] brr = {1,1,2,2,5,7,8,8,9,10};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i<arr.length && j<brr.length)
		{
			if(arr[i] == brr[j])
			{
				al.add(arr[i]);
				i++;
				j++;
			}
			else if(arr[i] < brr[j])
			{
				i++;
			}
			else
			{
				j++;
			}
			
		}
		System.out.println(al);
		

	}

}
