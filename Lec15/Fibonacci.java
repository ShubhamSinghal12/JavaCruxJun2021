package Lec15;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibTail(4,0,1));

	}
	
	public static int fib(int n)
	{
		if(n == 0|| n == 1)
		{
			return n;
		}
		else
		{
			int t = fib(n-1)+fib(n-2);
			return t;
		}
	}
	
	public static int fibTail(int n,int a,int b)
	{
		if(n == 1)
		{
			return b;
		}
		else
		{
			return fibTail(n-1,b,a+b);
		}
	}

}
