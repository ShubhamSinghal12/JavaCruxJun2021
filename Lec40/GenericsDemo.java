package Lec40;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GenericsDemo {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr1 = {1,3,4,2,5};
		String[] arr2 = {"Hi!","I","am","Shubham"};
		
		display(arr1);
		display(arr2);
		
		Car[] cars = new Car[5];
		// display(cars);
		cars[0] = new Car(1000, 135, "Black");
		cars[1] = new Car(2000, 60, "White");
		cars[2] = new Car(3450, 60, "Yellow");
		cars[3] = new Car(8907, 60, "Red");
		cars[4] = new Car(3400, 89, "Grey");
		
		display(cars);
		
//		bubbleSort(cars,new CarColorCompartor());
//		display(arr1);
//		bubbleSort(cars, new Comparator<Car>() {
//
//			@Override
//			public int compare(Car o1, Car o2) {
//				// TODO Auto-generated method stub
//				return o1.speed-o2.speed;
//			}
//		});
		
		Arrays.sort(cars,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				if(o1.speed == o2.speed)
					return o1.color.compareTo(o2.color);
				return o1.speed-o2.speed;
			}
		});
		
		display(cars);
		

	}
	
	public static <T> void display(T[] arr)
	{
		for(T val : arr)
		{
			System.out.println(val);
		}
		System.out.println();
	}
	
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	
	public static <T> void bubbleSort(T[] arr,Comparator<T> comp)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-i-1;j++)
			{
				if(comp.compare(arr[j], arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	

}
