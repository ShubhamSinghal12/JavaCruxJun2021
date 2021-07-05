package Lec4;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1010100;
		int ans = 0;
		int multi = 1;
		while(n!=0)
		{
			int rem = n%10;
			ans  = rem*multi+ans;
			n = n/10;
			multi *= 2;
		}
		System.out.println(ans);
		
	}

}
