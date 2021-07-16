package Lec10;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nos = 2;
		int noc = 2;
		int[] stalls = {1,9};
		
		for(int i = 1; i <= 9; i++)
		{
			if(isItPossible(stalls, noc, i) == false)
			{
				System.out.println(i-1);
				break;
			}
				
		}
		
		int low = 1;
		int high = 9;
		int ans = 0;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(isItPossible(stalls, noc, mid))
			{
				ans = mid;
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		System.out.println(ans);

	}
	
	
	
	public static boolean isItPossible(int[] stalls,int noc,int min)
	{
		int cows = 1;
		int place = stalls[0];
		
		for(int i = 1; i < stalls.length; i++)
		{
			int nplace = stalls[i];
			if(nplace - place >= min)
			{
				cows++;
				place = nplace;
			}
			if(cows >= noc)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	

}
