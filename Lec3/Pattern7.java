package Lec3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		
		int row = 1;
		int nst = n;
		int nsp = n-2;
		while(row <= n)
		{
			//Work
			
//			int cst = 1;
//			while(cst <= nst)
//			{
//				if(cst == 1 || cst == nst || row == 1 || row == n)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//				cst++;
//			}
			
			
			if(row == 1 || row == n)
			{
				int cst = 1;
				while(cst <= nst)
				{
					System.out.print("*");
					cst++;
				}
			}
			else
			{
				System.out.print("*");
				int csp = 1;
				while(csp <= nsp)
				{
					System.out.print(" ");
					csp++;
				}
				System.out.print("*");
			}
			
			
			//Update
			System.out.println();
			row++;
		}

	}

}
