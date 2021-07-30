package Lec17;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(5,""));

	}
	
	public static int stairs(int n,String ans) {
		
		if(n<0)
		{
			return 0;
		}
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			return stairs(n-1,ans+1) + stairs(n-2,ans+2);
//			if(n-2 >= 0)
		}	
	}
	
	

}
