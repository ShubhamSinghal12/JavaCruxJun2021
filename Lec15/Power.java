package Lec15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,5));
		System.out.println(powTail(2, 5, 1));

	}
	
	public static int pow(int a,int b)
	{
		if(b == 0)
		{
			return 1;
		}
		else
		{
			return a*pow(a,b-1);
		}
	}
	
	public static int powTail(int a,int b,int ans)
	{
		if(b == 0)
		{
			return ans;
		}
		else
		{
			
			return powTail(a,b-1,ans*a);
		}
	}

}
