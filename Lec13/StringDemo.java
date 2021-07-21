package Lec13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hellollolll";
		String s1 = "abc";
		String s3 = "abc";
		
		String s2 = new String("abc");
		s3 = s3+"d";
		System.out.println(s1==s);
		System.out.println(s3);
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		
		System.out.println(s.substring(1));
		
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.lastIndexOf("ll"));
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.startsWith("el",1));
		System.out.println(s.endsWith("ll"));
		System.out.println(s.replace("ll", "x"));

//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = s1;
//		String s4 = new String("abc");
//		String s5 = s1+false;
//		System.out.println(s5);
//		System.out.println((s4==s2)+" "+s4.equals(s2));
//		
		
		

	}

}
