package Lec15;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);

	}
	
	public static void PD(int n)
	{
		if(n<=0)
			return;
		else
		{
			System.out.println(n);
			PD(n-1);
		}
	}

}
