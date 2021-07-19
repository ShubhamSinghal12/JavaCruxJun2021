package Lec12;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		Integer b = new Integer(9);
		Integer c = Integer.valueOf(a);
		Integer a1 = 900;
		Integer a2 = 900;
		
		String s = a1.toString();
		Integer s1 = Integer.parseInt("9");
		System.out.println(s1 == a1);
		System.out.println(b==c);
		System.out.println(a1);
		
		int x = a1; // auto-unboxing
		int y = a1.intValue(); // unboxing
		System.out.println();
		
		
	}

}
