package Lec25;

public class Student_Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s = new Student("ramesh",100);
		System.out.println(s.name+" "+s.age);
		s.name = "Ramu";
		s.age = 20;
		System.out.println(s.name+" "+s.age);
		
		Student s1 = new Student(s);
//		s1.age = 10;
		System.out.println(s1.name+" "+s1.age);
		
		Student s2 = new Student();
		System.out.println(s2.name+" "+s2.age);
		
		System.out.println(Student.num);
		
//		Student s1 = s;
//		System.out.println(s1.name);
//		
//		Student s2 = new Student();
//		s2.name = "Arsh";
//		s2.age = 21;
//		
//		Student s3 = new Student();
//		s3.name = "Shub";
//		s3.age = 15;
		
		
//		System.out.println(s2.name+" "+s2.age);
//		System.out.println(s3.name+" "+s3.age);
//		System.out.println("----------------------");
//		
//		int myage = 10;
//		String myname = "Satish";
//		
//		Test3(s2,s3.age,s3.name,myage,myname);
//		
//		System.out.println("----------------------");
//		System.out.println(s2.name+" "+s2.age);//Change
//		System.out.println(s3.name+" "+s3.age);
//		System.out.println(myname+" "+myage);
		
//		s.introduceYourself("xyz");
//		System.out.println(s.name);
//		s2.introduceYourself();
	}
	
	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

	public static void Test2(Student s2, Student s3) {

		s2 = new Student();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;

		s3 = new Student();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);

	}
	
	public static void Test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
	}

}
