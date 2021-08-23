package Lec29;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,5,2,3,25,6,10};
		
		int[] ans = NextGreaterElement.nextGreaterElement(arr);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] nextGreaterElement(int[] arr)
	{
		int[] ans  = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[i] > arr[st.peek()])
			{
				int id = st.pop();
				ans[id] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			int id = st.pop();
			ans[id] = -1;
		}
		
		
		return ans;
	}
	

}
