package Lec12;

import java.util.ArrayList;

public class SumofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,9};
		int[] brr = {3,4,5,6,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int i = arr.length-1;
		int j = brr.length-1;
		
		int c = 0;
		while(i >= 0 || j >= 0)
		{
			int sum = 0;
			if(i>=0)
			{
				sum += arr[i];
				i--;
			}
			if(j >= 0)
				
			{
				sum += brr[j];
				j--;
			}
			sum += c;
			al.add(0,sum%10);
			c = sum/10;
		}
		
		if(c != 0)
		{
			al.add(0,c);
		}
		System.out.println(al);

	}

}
