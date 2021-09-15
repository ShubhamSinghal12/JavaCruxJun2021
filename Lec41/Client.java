package Lec41;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Pair<String,Integer> p = new Pair<>();
		p.a = "abc";
		p.b = 10;
		System.out.println(p.a + p.b);
		
		MyLinkedList<Object> ll = new MyLinkedList<>();
		ll.addFirst("Hi");
		ll.addLast("Bye");
		ll.addAt(10, 1);
		ll.addAt(true, 0);
		
		ll.display();
		
		ArrayList<Object> al = new ArrayList<>();
		
		Object[] arr = new Object[5];
		

	}

}
