package Lec27;

import Lec26.MyStack;

public class DynamicStack extends MyStack{
	
//	int[] arr = new int[5];
	
	public DynamicStack() {
		// TODO Auto-generated constructor stub
		super(5);
	}
	
	@Override
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			int[] newarr = new int[super.arr.length*2];
			for(int i = 0; i <= top; i++)
			{
				newarr[i] = arr[i];
			}
			super.arr = newarr;
		}
		super.push(ele);
	}

}
