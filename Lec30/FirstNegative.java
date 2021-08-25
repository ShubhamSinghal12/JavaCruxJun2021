package Lec30;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,-1,-7,8,-15,30,24,13};
		int k = 3;
		fn(arr,k);

	}
	public static void fn(int[] arr, int k)
	{
		Queue<Integer> qt = new LinkedList<>();
		for(int i = 0; i < k; i++)
		{
			if(arr[i] < 0)
				qt.add(i);
		}
		
		if(qt.isEmpty())
		{
			System.out.println(0+" ---> "+(k-1)+" "+0);
		}
		else
		{
			System.out.println(0+" ---> "+(k-1)+" "+ arr[qt.peek()]);
		}
		
		for(int i = k ; i < arr.length; i++)
		{
			if(!qt.isEmpty() && qt.peek() == i-k)
				qt.remove();
			
			if(arr[i] < 0)
				qt.add(i);
			
			if(qt.isEmpty())
			{
				System.out.println((i-k+1) +" ---> "+ i +" "+0);
			}
			else
				System.out.println((i-k+1)+" ---> "+ i +" "+arr[qt.peek()]);
			
		}
		
	}
	

}
