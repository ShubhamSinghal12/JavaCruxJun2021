package Lec26;

public class MyQueue {
	
	int[] arr;
	int front;
	int size;
	
	MyQueue(int n)
	{
		arr = new int[n];
		front = 0;
		size = 0;
	}
	MyQueue()
	 {
		 this(10);
	 }
	
	public boolean isFull()
	{
		if(size == arr.length)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	public int size()
	{
		return size;
	}
	
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue overflow");
		}
		arr[(size+front)%arr.length] = ele;
		size++;
	}
	
	public int peek() throws Exception  // get_front
	{
		if(isEmpty())
		{
			throw new Exception("Queue Underflow");
		}
		return arr[front];
	}
	
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
	
	public void display()
	{
		for(int i = front;  i < front+size; i++)
		{
			System.out.print(arr[i%arr.length]+" ");
		}
		System.out.println();
	}
	 

}
