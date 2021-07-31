package Lec18;

public class MappedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mps("234","");

	}
	
	public static void mps(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			char alpha = (char)(ch-'1'+'A');
			mps(ques.substring(1),ans+alpha);
			
			if(ques.length()>=2)
			{
				String st = ques.substring(0,2);
				int alp = Integer.parseInt(st);
				if(alp<=26)
					mps(ques.substring(2),ans+(char)('A'+alp-1));
			}
		}
	}
}
