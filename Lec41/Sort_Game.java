package Lec41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int th = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Employee> al = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			String name = sc.next();
			int salary = sc.nextInt();
			if(salary >= th)
				al.add(new Employee(name,salary));
		}
		System.out.println(al);
		
		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.salary == o2.salary)
					return o1.name.compareTo(o2.name);
				else
					return o2.salary-o1.salary;
			}
		});
		System.out.println(al);

	}
	
	
	private static class Employee{
		
		String name;
		int salary;
		
		Employee(String n,int s)
		{
			name = n;
			salary = s;
		}
		
		@Override
		public String toString()
		{
			return name+" "+salary;
		}
	}
	

}
