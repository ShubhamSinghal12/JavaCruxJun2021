package Lec1;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		int flag = 1;
		int i = 2;
		while(i<=n-1)
		{
			System.out.println(i);
			if(n%i == 0)
			{
//				System.out.println("Not Prime");
				flag = 0;
				break;
			}
			i++;
		}
		
		System.out.println("Prime");
//		if(flag == 1)
//		{
//			System.out.println("Prime");
//		}
//		else
//		{
//			System.out.println("Not Prime");
//		}

	}

}
