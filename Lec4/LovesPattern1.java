package Lec4;

public class LovesPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int nst = 1;
		int row = 1;
		while(row<=n)
		{
			int cst = 1;
			while(cst<=nst)
			{
				if(row%2 == 0 && cst != 1 && cst != nst)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				cst++;
			}
			
			row++;
			nst++;
			System.out.println();
		}
			
							

	}

}
