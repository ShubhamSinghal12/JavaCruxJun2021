package Lec28;

import Lec27.DynamicQueue;

public class StackUsingQueue {
	
	DynamicQueue qt = new DynamicQueue();
	
	
	//O(1)
	public void push(int ele) throws Exception
	{
		qt.enqueue(ele);
	}
	
	//O(1)
	public boolean isEmpty()
	{
		return qt.isEmpty();
	}
	
	//O(n)
	public int peek() throws Exception
	{
		DynamicQueue nqt = new DynamicQueue();
		while(qt.size()>1)
		{
			nqt.enqueue(qt.dequeue());
		}
		int n = qt.dequeue();
		nqt.enqueue(n);
		
		qt = nqt;
		
		return n;
	}
	
	//O(n)
	public int pop() throws Exception
	{
		DynamicQueue nqt = new DynamicQueue();
		while(qt.size()>1)
		{
			nqt.enqueue(qt.dequeue());
		}
		int n = qt.dequeue();
		
		qt = nqt;
		
		return n;
	}
	
	//O(1)
	public int size()
	{
		return qt.size();
	}
	
	//O(n)
	public void display() throws Exception
	{
		ar2(qt);
		qt.display();
		ar2(qt);
	}
	
	private void ar2(DynamicQueue qt) throws Exception{
		
		if(qt.isEmpty())
		{
			return;
		}
		int n = qt.dequeue();
		ar2(qt);
		qt.enqueue(n);
		
	}

}
