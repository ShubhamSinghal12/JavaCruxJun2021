package Lec43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import Lec40.Car;

public class GenClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[5];
		// display(cars);
		cars[0] = new Car(10000, 135, "Black");
		cars[1] = new Car(2000, 60, "White");
		cars[2] = new Car(3450, 60, "Yellow");
		cars[3] = new Car(8907, 60, "Red");
		cars[4] = new Car(3400, 89, "Grey");
		
		GenericHeap<Car> h = new GenericHeap<>();
		
		for(int i = 0 ; i < cars.length; i++)
			h.add(cars[i]);
		
		h.display();
		
		System.out.println(h.remove());
		
		System.out.println("------------------------");
		
		
		PriorityQueue<Integer> pmin = new PriorityQueue<>();
		pmin.add(20);
		pmin.add(30);
		pmin.add(10);
		pmin.add(100);
		pmin.add(7);
		System.out.println(pmin);
		System.out.println(pmin.remove());
		System.out.println(pmin);
		
		System.out.println("------------------------");
		
		PriorityQueue<Integer> pmax = new PriorityQueue<>(Collections.reverseOrder());
		pmax.add(20);
		pmax.add(30);
		pmax.add(10);
		pmax.add(100);
		pmax.add(7);
		System.out.println(pmax);
		System.out.println(pmax.remove());
		System.out.println(pmax);
		
		System.out.println("------------------------");
		ArrayList<Integer> al  = new ArrayList<Integer>(Arrays.asList(3,2,4,5,1,6,2));
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

	}

}
