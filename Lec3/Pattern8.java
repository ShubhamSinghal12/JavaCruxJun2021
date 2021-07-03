package Lec3;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int nsp1 = 0;
		int nsp2 = n-2;
		int row = 1;
		while(row <= n)
		{
			int csp1 = 1;
			while(csp1 <= nsp1)
			{
				System.out.print(" ");
				csp1++;
			}
			
			System.out.print("*");
			
			int csp2 = 1;
			while(csp2 <= nsp2)
			{
				System.out.print(" ");
				csp2++;
			}
			
			if(row != n/2+1)
				System.out.print("*");
			
			
			if(row <= n/2)
			{
				nsp1 +=1;
				nsp2 -= 2;
			}
			else
			{
				nsp1 -= 1;
				nsp2 += 2;
			}
			System.out.println();
			row++;
		}
		

	}

}
