package Lec17;

import java.util.ArrayList;

public class KeyPadCombination {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyPadComb("234", "");
		System.out.println(al);

	}
	
	public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static ArrayList<String> al = new ArrayList<String>();
	
	public static void keyPadComb(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			al.add(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			String st = map[ch-'0'];
			for(int i = 0; i< st.length(); i++)
			{
				keyPadComb(ques.substring(1), ans+st.charAt(i));
			}
		}
	}

}
