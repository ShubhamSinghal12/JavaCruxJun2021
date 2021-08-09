package Lec22;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,3,4,5};
//		int[] b = {2,3,6,7};
//		int[] c = merge(a, b);
//		System.out.println(Arrays.toString(c));
		
		int[] arr = {4,2,5,3,1,2,6,4};
		int[] sorted = mergerSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(sorted));

	}
	
	public static int[] merge(int[] a,int[] b)
	{
		int[] result = new int[a.length+b.length];
		int i,j,k;
		i = j = k = 0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				result[k] = a[i];
				i++;
				k++;
			}
			else
			{
				result[k] = b[j];
				j++;
				k++;
			}
		}
		while(j<b.length)
		{
			result[k] = b[j];
			j++;
			k++;
		}
		while(i<a.length)
		{
			result[k] = a[i];
			i++;
			k++;
		}
		return result;
	}
	
	public static int[] mergerSort(int[] arr,int si,int ei)
	{
		if(si>ei)
		{
			int[] ans = new int[0];
			return ans;
		}
		else if(si == ei)
		{
			int[] ans = new int[1];
			ans[0] = arr[si];
			return ans;
		}
		else
		{
			int mid = (si+ei)/2;
			int[] a = mergerSort(arr, si,mid);
			int[] b = mergerSort(arr, mid+1, ei);
			return merge(a, b);
		}
	}

}
