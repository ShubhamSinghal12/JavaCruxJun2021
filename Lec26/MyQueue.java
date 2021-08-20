package Lec26;

public class MyQueue {
	
	protected int[] arr;
	protected int front;
	protected int size;
	
	public MyQueue(int n)
	{
		arr = new int[n];
		front = 0;
		size = 0;
	}
	public MyQueue()
	 {
		 this(10);
	 }
	
	//O(1)
	public boolean isFull()
	{
		if(size == arr.length)
			return true;
		else
			return false;
	}
	
	//O(1)
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	//O(1)
	public int size()
	{
		return size;
	}
	
	//O(1)
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue overflow");
		}
		
		arr[(size+front)%arr.length] = ele;
		size++;
	}
	
	//O(1)
	public int peek() throws Exception  // get_front
	{
		if(isEmpty())
		{
			throw new Exception("Queue Underflow");
		}
		return arr[front];
	}
	
	//O(1)
	public int dequeue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue Underflow");
		}
		
		int ele = arr[front];
		front = (front+1)%arr.length;
		size--;
		return ele;	
	}
	
	//O(n)
	public void display()
	{
		for(int i = front;  i < front+size; i++)
		{
			System.out.print(arr[i%arr.length]+" ");
		}
//		for(int i = 0; i < size; i++)
//		{
//			System.out.print(arr[(front+i)%arr.length]+" ");
//		}
		System.out.println();
	}
	 

}
