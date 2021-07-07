package Lec5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
		
		int nsp = 1;
		int nst = (2*n)-2;
		int row = 1;
		int nso = 1;
		while(row<=n)
		{
			//work
			int csp=1;
			int val = 1;
			while(csp<=nsp)
			{
				System.out.print(val+" ");
				csp++;
				val++;
			}
			int cst = 1;
			while(cst<nst)
			{
				System.out.print("  ");
				cst++;
			}
			int cso=1;
			while(cso<=nso)
			{	
				--val;
				if(cso==nso && row == n) {
					continue;
				}
				else if(row==n) {
					System.out.print(val-1+" ");
				}
				else
					System.out.print(val+" ");
				cso++;
			}
			//updation
			System.out.println();
			nsp++;
			nst-=2;
			row++;
			nso++;
		}

	}

}
