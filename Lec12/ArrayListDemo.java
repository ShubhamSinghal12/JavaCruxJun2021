package Lec12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> al1 = new ArrayList<Integer>(100);
		System.out.println(al1.size());
		System.out.println(al);
		al.add(10);
		al.add(20);
		System.out.println(al);
		al.add(15);
		System.out.println(al);
		System.out.println(al.size());
		
		//Update
		System.out.println(al.get(5));
		al.set(1, 100);
		System.out.println(al);
		
		//remove
//		al.clear();
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		Collections.sort(al);
		System.out.println(al);
		
//		for(int i = 0; i < 10; i++)
//		{
//			int a = sc.nextInt();
//			al1.add(a);
//		}
		
		for(int val:al)
		{
			System.out.println(val);
		}
		
		
	}
	 

}
