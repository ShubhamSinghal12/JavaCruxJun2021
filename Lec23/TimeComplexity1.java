package Lec23;

public class TimeComplexity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int n = 1000000;
		int k = 7;
		
		while(i<=n)  //TC O(n)
		{
			i++;
		}
		
		while(i<=n) //TC O(n)
		{
			i+=2;
//			i+=3;
		}
		
		while(i<=n) //TC O(n/k)
		{
			i+=k;
		}
		
		
		//-------------------------------------
		
		
		while(i<=n) //TC O(Log2N)
		{
			i *= 2;
		}
		
		while(i<=n) //TC O(Log3N)
		{
			i *= 3;
			//i *= 2;
		}
		
		while(i<=n)//TC O(LogkN)
		{
			i *= k;
		}
		
		//-----------------------------------------
		
		while(n > 0) //TC O(log2N)
		{
			n /= 2;
		}
		
		while(n > 0) //TC O(log3N)
		{
			n /= 3;
		}
		
		while(n > 0) //TC O(logkN)
		{
			n /= k;
		}
		
		
		//-----------------------------------------
		
		while(n > 0) //O(n)
		{
			n -= 1;
		}
		
		while(n > 0) //O(n)
		{
			n -= 3;
			//n -= 2;
		}
		
		while(n > 0) //O(n/k)
		{
			n -= k;
		}
		
				

	}

}
