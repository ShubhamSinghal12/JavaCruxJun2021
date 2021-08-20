package Lec27;

import Lec26.MyQueue;

public class DynamicQueue extends MyQueue{
	
	@Override
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			int[] na = new int[arr.length*2];
			for(int i = 0; i < size; i++)
			{
				na[i] = arr[(front+i)%arr.length];
			}
			arr = na;
			front = 0;
		}
		super.enqueue(ele);
	}

}
