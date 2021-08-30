package Lec31;

import java.util.LinkedList;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MyLinkedList ll1 = new MyLinkedList();
		MyLinkedList ll2 = new MyLinkedList();
		
		
		ll1.addFirst(1);
		ll1.addFirst(4);
		ll1.addFirst(2);
		ll1.addFirst(6);
		ll1.addFirst(10);
		ll1.display();
		
		ll1.mergerSort();
		ll1.display();
//		for(int i = 5; i > 0; i-=2)
//		{
//			ll1.addFirst(i);
//			ll1.display();
//		}
//		for(int i = 10; i > 0; i-=2)
//		{
//			ll2.addFirst(i);
//			ll2.display();
//		}
//		MyLinkedList ll3 = MyLinkedList.merge(ll1, ll2);
//		ll3.display();
//		ll.addAt(0, 2);
//		ll.display();
//		
//		System.out.println(ll.getLast());
//		
//		ll.removeAt(5);
//		ll.display();
//		ll.removeLast();
//		ll.display();
//		
//		ll.reverseData2();
//		ll.display();
//		
//		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
//		for(int i = 8; i >= 1; i--)
//		{
//			ll.addFirst(i);
//		}
//		ll.display();
//		ll.reverse_k(3);
//		ll.display();
//		System.out.println(ll.mid());

//		ll.dummyListForCycle();
//		ll.display();
	}

}
