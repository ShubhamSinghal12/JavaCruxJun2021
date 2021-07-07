package Lec5;

public class FunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
//		int a=5;
//		addition();
//		subtraction();
//		addition2(10,20);
		int x = 10;
		int a = addition3(x, 20);
		System.out.println(a);
		System.out.println("Bye");
		

	}
	
	public static void addition()
	{
		int a = 5;
		int b = 6;
		int sum = a+b;
		subtraction();
		System.out.println(sum);
		
	}
	public static void subtraction()
	{
		int a = 5;
		int b = 6;
		int diff = b-a;
//		addition();
		System.out.println(diff);
	}

	public static void addition2(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static int addition3(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
}
