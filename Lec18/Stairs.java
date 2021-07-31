package Lec18;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(5,"",new int[] {1,2},0));

	}
	
	public static int stairs(int n,String ans,int lastStair) {
		
		if(n<0)
		{
			return 0;
		}
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			if(lastStair <= 1)
				count += stairs(n-1,ans+1,1);
			
			count += stairs(n-2,ans+2,2);
			return count;
		}	
	}
	
public static int stairs(int n,String ans,int[] stairs,int lastStair) {
		
		if(n<0)
		{
			return 0;
		}
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			for(int i = lastStair; i < stairs.length;i++)
			{
				count += stairs(n-stairs[i],ans+stairs[i],stairs,i);
			}
			return count;
		}	
	}

}
