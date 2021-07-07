package Lec5;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		swap(a,b);
//		main(new String[] {"abc"});
		System.out.println(a+" "+b);

	}
	
	public static int swap(int a,int b)
	{
		int t = a;
		a = b;
		b = t;
		System.out.println(a+" "+b);
		return 0;
	}

}
