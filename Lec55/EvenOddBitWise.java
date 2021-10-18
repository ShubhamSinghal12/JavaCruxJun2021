package Lec55;

public class EvenOddBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd(100);

	}
	
	public static void evenOdd(int n)
	{
		if((n&1) == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
