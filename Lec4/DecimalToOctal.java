package Lec4;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int ans = 0;
		int multi = 1;
		while(n!=0)
		{
			int rem = n%8;
			ans  = rem*multi+ans;
			n = n/8;
			multi *= 10;
		}
		System.out.println(ans);

	}

}
