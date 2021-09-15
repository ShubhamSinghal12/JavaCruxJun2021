package Lec41;

public class MyLinkedList <T> {

	
	private class Node
	{
		
		T data;
		Node next;
		
//		Node()
//		{
//			this(0);
//		}
		Node(T data)
		{
			this(data,null);
		}
		Node(T data,Node n)
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
	
	public void addFirst(T ele)
	{
		Node n = new Node(ele,head);
		head = n;
	}
	
	public void addLast(T ele)
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
	
	public void addAt(T ele,int id) throws Exception
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
	
	
	public T getFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		return head.data;
	}
	
	public T getLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		Node temp = getNodeAt(size()-1);
		return temp.data;
	}
	
	public T getAt(int id) throws Exception
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
	
	
	public T removeFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("List is Empty");
		}
		T td = head.data;
		head = head.next;
		return td;
	}
	
	public T removeLast() throws Exception
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
		T td = temp.next.data;
		temp.next = null;
		return td;
		
	}
	public T removeAt(int id) throws Exception
	{
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}
		
		Node temp = getNodeAt(id-1);
		T td = temp.next.data;
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
	
	
	public void reverseData()
	{
		int i = 0;
		int j = size()-1;
		while(i<j)
		{
			Node a = getNodeAt(i);
			Node b = getNodeAt(j);
			
			T t = a.data;
			a.data = b.data;
			b.data = t;
			
			i++;
			j--;
		}
	}
	
	public void reverseData2()
	{
		reverseD2(head,1,size());
	}
	
	private Node reverseD2(Node n,int count,int size)
	{
		if(n == null)
			return head;
		else
		{
			Node a = reverseD2(n.next,count+1,size);
			
			if(count > (size+1)/2)
			{
				T t = a.data;
				a.data = n.data;
				n.data = t;
			}
			
			return a.next;
		}
		
		
	}
	public void reverse_k(int k)
	{
		head = reverse_k(head,k);
	}
	private Node reverse_k(Node n,int k)
	{
		if(n == null)
			return n;
		
		Node temp = n;
		int t = k;
		while(t>0 && temp != null)
		{
			temp = temp.next;
			t--;
		}
		Node prev = reverse_k(temp,k);
		Node cur = n;
		
		while(cur != temp)
		{
			Node ahead = cur.next;
			cur.next = prev;
			
			prev = cur;
			cur = ahead;
		}
		
		return prev;
		
	}
	
	public T mid()
	{
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	
	
	
//	public static MyLinkedList merge(MyLinkedList a,MyLinkedList b)
//	{
//		MyLinkedList result = new MyLinkedList(); 
//		Node i = a.head;
//		Node j = b.head;
//		
//		while(i != null && j != null)
//		{
//			if(i.data < j.data)
//			{
//				result.addLast(i.data);
//				i = i.next;
//			}
//			else
//			{
//				result.addLast(j.data);
//				j = j.next;
//			}
//		}
//		
//		while(j!=null)
//		{
//			result.addLast(j.data);
//			j = j.next;
//		}
//		while(i != null)
//		{
//			result.addLast(i.data);
//			i = i.next;
//		}
//		return result;
//	}
//	
//	private Node midNode()
//	{
//		Node slow = head;
//		Node fast = head;
//		while(fast.next != null && fast.next.next != null)
//		{
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		return slow;
//	}
//	
//	public void mergerSort()
//	{
//		MyLinkedList ll = mergeHelper();
//		this.head = ll.head;
//	}
//	
//	private MyLinkedList mergeHelper()
//	{
//		
//		if(size() <= 1)
//		{
//			MyLinkedList ll = new MyLinkedList();
//			ll.head = this.head;
//			return ll;
//		}
//		
//		Node mid = midNode();
//		MyLinkedList a = new MyLinkedList();
//		MyLinkedList b = new MyLinkedList();
//		
//		System.out.println(head.data+" "+mid.data);
//		a.head = this.head;
//		b.head = mid.next;
//		mid.next = null;
//		
//		MyLinkedList fh = a.mergeHelper();
//		MyLinkedList sh = b.mergeHelper();
//		
//		return merge(fh, sh);
//	}
//	
//	
//	public void dummyListForIntersection()
//	{
//		Node head1 = null;
//		Node head2 = null;
//		
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
//		Node n9 = new Node(9);
//		Node n10 = new Node(10);
//		Node n11 = new Node(11);
//		Node n12 = new Node(12);
//		Node n13 = new Node(13);
//		
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//		n8.next = n9;
//		n9.next = n10;
//		n10.next = null;
//		n11.next = n12;
//		n12.next = n13;
//		n13.next = n7;
//		
//		head1 = n1;
//		head2 = n11;
//		intersection(head1,head2);
//		
//	}
//	
//	private void intersection(Node head1,Node head2)
//	{
//		Node s1 = head1;
//		Node s2 = head2;
//		
//		while(s1 != s2)
//		{
//			if(s1 == null)
//			{
//				s1 = head2;
//			}
//			if(s2 == null)
//			{
//				s2 = head1;
//			}
//			
//			s1 = s1.next;
//			s2 = s2.next;
//		}
//		System.out.println(s1.data);
//	}
//	
//	public void dummyListForCycle()
//	{
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
//		
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//		n8.next = n3;
//		
//		head = n1;
//		cycleDR(head);
//		
//	}
//	
//	private void cycleDR(Node head) {
//		
//		Node slow = head;
//		Node fast = head;
//		
//		while(fast != null && fast.next != null)
//		{
//			slow = slow.next;
//			fast = fast.next.next;
//			
//			if(slow == fast)
//			{
//				System.out.println("There is a cycle");
//				break;
//			}
//		}
//		
//		
//		Node temp = head;
//		while(slow.next != temp.next)
//		{
//			slow = slow.next;
//			temp = temp.next;
//		}
//		
//		slow.next = null;
//		
//		
//		
//	}
	
}
