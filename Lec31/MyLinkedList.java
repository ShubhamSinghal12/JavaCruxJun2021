package Lec31;

public class MyLinkedList {

	
	private class Node
	{
		
		int data;
		Node next;
		
//		Node()
//		{
//			this(0);
//		}
		Node(int data)
		{
			this(data,null);
		}
		Node(int data,Node n)
		{
			this.data = data;
			this.next = n;
			
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public int size()
	{
		int count = 0;
		Node temp = head;
		while(temp!=null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int ele)
	{
		Node n = new Node(ele,head);
		head = n;
	}
	
	public void addLast(int ele)
	{
		if(isEmpty())
		{	
			addFirst(ele);
			return;
		}
		
		Node temp = getNodeAt(size()-1);
		Node n = new Node(ele);
		temp.next = n;
	}
	
	public void addAt(int ele,int id) throws Exception
	{
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}
		
		if(id == 0)
		{
			addFirst(ele);
			return;
		}
		
		Node temp = getNodeAt(id-1);
		Node n = new Node(ele,temp.next);
		temp.next = n;
		
	}
	
	
	public int getFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		return head.data;
	}
	
	public int getLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		Node temp = getNodeAt(size()-1);
		return temp.data;
	}
	
	public int getAt(int id) throws Exception
	{
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}

		Node temp = getNodeAt(id);
		return temp.data;
	}
	
	private Node getNodeAt(int id)
	{
		Node temp = head;
		while(id > 0)
		{
			temp = temp.next;
			id--;
		}
		return temp;
		
	}
	
	
	public int removeFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		int td = head.data;
		head = head.next;
		return td;
	}
	
	public int removeLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		
		int s = size();
		if(s == 1)
		{
			return removeFirst();
		}
		
		Node temp = getNodeAt(s-2);
		int td = temp.next.data;
		temp.next = null;
		return td;
		
	}
	public int removeAt(int id) throws Exception
	{
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}
		
		Node temp = getNodeAt(id-1);
		int td = temp.next.data;
		temp.next = temp.next.next;
		return td;
		
	}
	
	public void reverse()
	{
		Node prev = head;
		Node curr = head.next;
		while(curr != null)
		{
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		head = prev;
	}
	
	
	public void reverseR()
	{
		reverseRR(head,null);
	}
	
	private void reverseRR(Node cur, Node prev)
	{
		if(cur == null)
		{
			head = prev;
			return;
		}
		
		reverseRR(cur.next, cur);
		cur.next = prev;
		
	}
	
	public void reverseOR()
	{
		Node temp = head;
		reverseORR(head);
		temp.next = null;
	}
	
	private void reverseORR(Node prev)
	{
		if(prev.next == null)
		{
			head = prev;
			return;
		}
		reverseORR(prev.next);
		prev.next.next = prev;
		
	}
	
	
}
