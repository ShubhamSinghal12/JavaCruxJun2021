package Lec22;

public class LetterTilePossibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "CCB";
		int[] freq = new int[26];
		for(int i = 0; i < st.length(); i++)
		{
			freq[st.charAt(i)-'A']++;
		}
		System.out.println(tp(freq,""));

	}
	
	public static int tp(int[] freq,String ans)
	{
		int res = 0;
		if(ans.length()!=0) {
			System.out.println(ans);
			res = 1;
		}
		
		for(int i = 0; i < freq.length;i++)
		{
			if(freq[i] != 0) {
				freq[i]--;
				res += tp(freq,ans+(char)(i+'A'));
				freq[i]++;
			}
		}
		return res;
	}

}
