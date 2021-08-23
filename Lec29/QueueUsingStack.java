package Lec29;

import Lec27.DynamicStack;

public class QueueUsingStack {
	
	DynamicStack st = new DynamicStack();
	
	
	public void enqueue(int n) throws Exception
	{
		pushAtFirst(st, n);
	}
	
	private void pushAtFirst(DynamicStack st, int n) throws Exception
	{
		if(st.isEmpty())
		{
			st.push(n);
			return;
		}
		
		int i = st.pop();
		pushAtFirst(st, n);
		st.push(i);
	}
	
	public int peek() throws Exception
	{
		return st.peek();
	}
	
	public int dequeue() throws Exception{
		
		return st.pop();
	}
	
	public int size() {
		return st.size();
	}
	public boolean isFull()
	{
		return st.isFull();
	}
	
	public boolean isEmpty()
	{
		return st.isEmpty();
	}
	
	public void display()
	{
		st.display();
	}

}
