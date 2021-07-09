package Lec6;
import java.util.Scanner;
public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			int row = 1;
			int nst = 1;
			int nsp = 2*N-3;
			int val = 1;
			while(row<=N)
			{
				int cst = 1;
				while(cst <= nst)
				{
					System.out.print(val+" ");
					val++;
					cst++;
				}
				
				int csp = 1;
				while(csp <= nsp)
				{
					System.out.print("  ");
					csp++;
				}
				
				cst = 1;
				
				if(row == N)
				{
					cst = 2;
					val--;
				}
				
				while(cst <= nst)
				{
					val--;
					System.out.print(val+" ");
					cst++;
				}
				
				
				nst += 1;
				nsp -= 2;
				row++;
				System.out.println();
			}
	}
}
