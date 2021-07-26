package Lec15;

public class PrintIncresing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PI(5);
		PI2(2,5);
		
	}
	
	public static void PI(int n)
	{
		if(n<=0)
			return;
		else
		{
			PI(n-1);
			System.out.println(n);
		}
	}
	
	public static void PI2(int n1,int n2)
	{
		if(n1>n2)
			return;
		else {
			System.out.println(n1);
			PI2(n1+1,n2);
		}
	}

}
