package Lec2;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 36;
		int b = 28;
		while(a%b != 0)
		{
			int rem = a%b;
			a = b;
			b = rem;
		}
		
		System.out.println(b);

	}

}
