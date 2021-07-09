package Lec6;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456;
		rotate2(n,23);
	}
	
	public static int noOfDigits(int n)
	{
		int count  = 0;
//		while(n != 0)
//		{
//			count++;
//			n /= 10;
//		}
		count = (int)Math.log10(n)+1;
		return count;
	}
	
	public static void rotate(int n,int x)
	{
		int nod = noOfDigits(n);
		
		x = x%nod;
		if(x<0)
		{
			x += nod;
		}
		
		//One Rotation
		for(int i = 1; i <= x; i++)
		{
			int newNo = (n%10)*(int)Math.pow(10, nod-1)+(n/10);
			n = newNo;
		}
		System.out.println(n);
	}
	public static void rotate2(int n,int x)
	{
		int nod = noOfDigits(n);
		
		x = x%nod;
		if(x<0)
		{
			x += nod;
		}
		
		int nx = n%(int)Math.pow(10, x);
		int ny = n/(int)Math.pow(10, x);
		
		int ans = nx*(int)Math.pow(10, nod-x) + ny;
		System.out.println(ans);
	}
	

}
