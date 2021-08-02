package Lec19;

public class PalindromePartitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pp("nitin","");

	}
	
	public static boolean isPalindrome(String st)
	{
		int i= 0;
		int j = st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
	}
	
	public static void pp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 1; i <= ques.length(); i++)
			{
				String na = ques.substring(0,i);
				if(isPalindrome(na)) {
					pp(ques.substring(i),ans+na+" ");
				}
			}
		}
		
	}
}
