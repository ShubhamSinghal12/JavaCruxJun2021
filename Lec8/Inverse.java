package Lec8;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,0,3,1};
		int[] inv = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			inv[arr[i]] = i;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(inv));
		
		
	}

}
