package Lec24;

public class CountPalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cps("itti"));

	}
	
	public static int cps(String st)
	{
		int count = 0;
		//Odd Length
		
		for(int i = 0; i < st.length(); i++)
		{
			count++;
			int l = i-1;
			int r = i+1;
			while(l>=0 && r < st.length())
			{
				if(st.charAt(l) == st.charAt(r))
				{
					count++;
					l--;
					r++;
				}
				else
				{
					break;
				}
			}
		}
		
		//Even Length
		for(double i = 0.5;i<st.length();i++)
		{
			int l = (int)(i-0.5);
			int r = (int)(i+0.5);
			while(l>=0 && r < st.length())
			{
				if(st.charAt(l) == st.charAt(r))
				{
					count++;
					l--;
					r++;
				}
				else
				{
					break;
				}
			}
		}
		
		return count;
	}

}
