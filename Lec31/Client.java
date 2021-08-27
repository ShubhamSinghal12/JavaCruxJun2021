package Lec31;

import java.util.LinkedList;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MyLinkedList ll = new MyLinkedList();
		for(int i = 5; i > 0; i--)
		{
			ll.addFirst(i);
			ll.display();
		}
		ll.addAt(0, 2);
		ll.display();
		
		System.out.println(ll.getLast());
		
		ll.removeAt(5);
		ll.display();
		ll.removeLast();
		ll.display();
		
		ll.reverseOR();
		ll.display();
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();

	}

}
