package Lec9;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		
//		int[] ans = new int[arr.length];
//		
//		int prod = 1;
//		int[] lp = new int[arr.length];
//		for(int i = 0; i < lp.length; i++)
//		{
//			lp[i] = prod;
//			prod *= arr[i]; 
//		}
//		System.out.println(Arrays.toString(lp));
//		
//		int[] rp = new int[arr.length];
//		prod = 1;
//		for(int i = arr.length-1; i >= 0;i--)
//		{
//			rp[i] = prod;
//			prod *= arr[i]; 
//		}
//		
//		System.out.println(Arrays.toString(rp));
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			ans[i] = lp[i]*rp[i];
//		}
//		
//		System.out.println(Arrays.toString(ans));
//		
		
		int[] ans = new int[arr.length];
		
		int prod = 1;
//		int[] lp = new int[arr.length];
		for(int i = 0; i < ans.length; i++)
		{
			ans[i] = prod;
			prod *= arr[i]; 
		}
		System.out.println(Arrays.toString(ans));
		
//		int[] rp = new int[arr.length];
		prod = 1;
		for(int i = arr.length-1; i >= 0;i--)
		{
			ans[i] *= prod;
			prod *= arr[i]; 
		}
		
		System.out.println(Arrays.toString(ans));
		
		

		
		

	}

}
