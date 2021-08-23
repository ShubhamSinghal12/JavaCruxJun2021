package Lec29;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,100,80,60,70,60,75,85};
		int[] ans = stockSpan(arr);
		System.out.println(Arrays.toString(ans));
		
		

	}
	
	public static int[] stockSpan(int[] arr)
	{
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[i] > arr[st.peek()])
			{
				st.pop();
			}
			
			if(st.isEmpty())
			{
				ans[i] = i+1;
			}
			else
			{
				ans[i] = i-st.peek();
			}
			
			st.push(i);
			
		}
		
		return ans;
	}

}
