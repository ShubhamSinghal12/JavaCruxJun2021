package Lec5;

public class DTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		short s = 343;
		int i = 1000_000_000;
		long l = 1000_000_0000l;
		
		//Explicit Type casting
		b = (byte)s;
//		System.out.println(b);
//		b =i;
//		b = l;
		
		s = b; //implicit TypeCasting
		s = (short)l;
		
		
		char ch = 'a';
//		ch = (char)i;
		ch = (char)(ch+1);
		i = ch+1;
		System.out.println(ch);
		
		float f = 3.14243656f;
		double d = 3.14;
		
		
		f = 3;
		System.out.println(f);
		
		
		i = 5;
		System.out.println("abc"+f);
		System.out.println(10+20+"Hello"+10+20+10);
		System.out.println(2+" "+5);
		
		
		
		

	}

}
