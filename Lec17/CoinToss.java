package Lec17;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(coinTossC(3, ""));
		
		System.out.println(coinTossNo2Con_2(3, ""));
		System.out.println(coinTossNo2Con(3, ""));
		
	}
	
	
	public static void coinToss(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else
		{
			coinToss(n-1,ans+"H");
			coinToss(n-1,ans+"T");
		}
	}
	public static int coinTossNo2Con(int n,String ans)
	{
		if(n == 0)
		{
			if(ans.indexOf("HH") == -1)
			{
				
				System.out.println(ans);
				return 1;
			}
			return 0;
		}
		else
		{
			int count = 0;
			count += coinTossNo2Con(n-1,ans+"H");
			count += coinTossNo2Con(n-1,ans+"T");
			return count;
		}
	}
	
	public static int coinTossNo2Con_2(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
//			if(ans.length() == 0)
//				coinTossNo2Con_2(n-1,ans+"H");
			int count = 0;
			if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H')
				count+= coinTossNo2Con_2(n-1,ans+"H");
			
			count += coinTossNo2Con_2(n-1,ans+"T");
			return count;
		}
	}
	
	public static int coinTossC(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			count += coinTossC(n-1,ans+"H");
			count += coinTossC(n-1,ans+"T");
			return count;
		}
	}
	

}
