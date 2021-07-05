package Lec4;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int ans = 0;
		int multi = 1;
		
		while(n!=0)
		{
			int rem = n%2;
			ans  = rem*multi+ans;
			n = n/2;
			multi *= 10;
		}
		
		System.out.println(ans);

	}

}
