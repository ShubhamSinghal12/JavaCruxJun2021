package Lec17;

public class LexoGraphical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 1; i<= 9; i++)
//			lexo(1,i);
//		
		lexo2(1000,0);

	}
	
	public static void lexo(int n,int count)
	{
		if(count > n)
		{
			return;
		}
		else
		{
			System.out.println(count);
			for(int i = 0; i<= 9; i++)
			{
				lexo(n,count*10+i);
			}
		}
	}
	public static void lexo2(int n,int count)
	{
		if(count > n)
		{
			return;
		}
		else
		{
//			System.out.println(count);
			int i = 0;
			if(count == 0)
				i = 1;
			else
				System.out.println(count);
			
			for(; i<= 9; i++)
			{
				lexo2(n,count*10+i);
			}
		}
	}
	
}
