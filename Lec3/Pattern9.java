package Lec3;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while(row <= n)
		{
			//Work
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			
			//Update
			nst += 2;
			nsp--;
			row++;
			System.out.println();
			
		}

	}

}
