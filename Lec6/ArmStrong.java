package Lec6;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArmStrong(1, 1000);

	}
	
	public static int nod(int n)
	{
		return (int)Math.log10(n)+1;
	}
	
	public static void printArmStrong(int min,int max) {
		
		for(int i = min; i<= max; i++)
		{
			if(isArmStrong(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArmStrong(int n)
	{
		int nod = nod(n);
		int temp = n;
		int sum = 0;
		while(temp != 0)
		{
			int rem = temp%10;
			sum += (int)Math.pow(rem, nod);
			temp /= 10;
		}
		return sum==n;
	}

}
