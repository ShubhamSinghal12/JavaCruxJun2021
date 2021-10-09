package Lec53;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "horse";
		String word2 = "ros";
		System.out.println(ed(word1,word2,0,0));
		System.out.println(edBU(word1, word2));

	}
	
	public static int ed(String word1, String word2,int i,int j)
	{
		if(i == word1.length())
			return word2.length()-j;
		if(j == word2.length())
			return word1.length()-i;
		
		
		if(word1.charAt(i) == word2.charAt(j))
		{
			return ed(word1, word2, i+1, j+1);
		}
		else
		{
			int ii = ed(word1, word2, i, j+1);
			int d = ed(word1, word2, i+1, j);
			int r = ed(word1, word2, i+1, j+1);
			
			int ans = Math.min(ii, Math.min(d, r))+1;
			return ans;
		}
	}
	
	public static int edBU(String word1,String word2)
	{
		int[][] dp = new int[word1.length()+1][word2.length()+1];
		for(int i = 0; i <= word2.length(); i++)
			dp[word1.length()][i] = word2.length()-i;
		
		for(int i = 0; i <= word1.length(); i++)
			dp[i][word2.length()] = word1.length()-i;
		
		for(int i = word1.length()-1; i >= 0; i--)
		{
			for(int j = word2.length()-1; j >= 0; j--)
			{
				if(word1.charAt(i) == word2.charAt(j))
					dp[i][j] = dp[i+1][j+1];
				else
					dp[i][j] = 1+Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i+1][j+1]));
			}
		}
		
		return dp[0][0];
	}

}
