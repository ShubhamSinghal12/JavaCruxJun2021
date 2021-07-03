package Lec2;

public class CountParticularDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 543545;
		int digit = 5;
		int count  = 0;
		while(n != 0)
		{
			int rem = n%10;
			if(rem == digit)
			{
				count++;
			}
			n = n/10;
		}
		System.out.println(count);

	}

}
