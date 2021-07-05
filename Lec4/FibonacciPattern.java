package Lec4;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		int nst = 1;
		int row = 1;
		int val = 0;
		int b = 1;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(val+" ");
				int c = val+b;
				val = b;
				b = c;
				cst++;
			}
			
			nst++;
			row++;
			System.out.println();
		}
		

	}

}
