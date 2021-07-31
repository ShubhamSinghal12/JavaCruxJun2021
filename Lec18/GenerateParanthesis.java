package Lec18;

public class GenerateParanthesis {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gp(3,0,0,"");
	}
	
	public static void gp(int n,int open,int close,String ans)
	{
		if(open == n && close == n)
		{
			System.out.println(ans);
		}
		else
		{
			if(open<n)
			{
				gp(n,open+1,close,ans+"(");
			}
			if(close<open)
			{
				gp(n,open,close+1,ans+")");
			}
		}
	}

}
