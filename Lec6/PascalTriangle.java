package Lec6;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		int row = 0;
		int nst = 1;
		int val = 1;
		while(row<n)
		{
			int cst = 0;
			while(cst < nst)
			{
				System.out.print(val+" ");
				cst++;
				val = (row-cst+1)*val/cst;
			}
			
			row++;
			nst++;
			val = 1;
			System.out.println();
		}

	}

}
