package Lec24;

public class SievesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 25;
		boolean ps[] = new boolean[n+1];
		
		for(int i = 2; i*i<=n; i++)
		{
			if(ps[i] == false)
			{
				for(int multi = 2; multi*i<=n;multi++)
				{
					ps[multi*i] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(ps[i] == false)
			{
				System.out.println(i);
			}
		}

	}

}
