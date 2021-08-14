package Lec24;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(2, 6));

	}
	
	public static int power(int a,int n)
	{
		if(n == 0)
			return 1;
		
		int half = power(a,n/2);

		if(n%2 == 0)
		{
			return half*half;
		}
		else
		{
			return half*half*a;
		}
	}
	

}
