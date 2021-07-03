package Lec2;

public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 15;
		int n = 2;
		int flag = 1;
		while(n<=N)
		{
			flag = 1;
			int i = 2;
			while(i*i<=n)
			{
				if(n%i == 0)
				{
					flag = 0;
					break;
				}
				i++;
			}
			if(flag == 1)
			{
				System.out.println(n);
			}
			n++;
			
		}

	}

}
