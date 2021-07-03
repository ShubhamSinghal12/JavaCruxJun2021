package Lec2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		
		int row = 1;
		int nst = n;
		while(row <= n)
		{
			//Work
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("*");
				cst++;
			}
			
			
			//Update
			System.out.println();
			row++;
		}
		

	}

}
