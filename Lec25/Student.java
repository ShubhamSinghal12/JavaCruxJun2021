package Lec25;

public class Student {
	
	String name ="Hello";
	int age = 1;
	
	static int num = 0;
	
	
	public Student()
	{
//		this("-",10);
		name="hi";
		age = 100;
		num++;
	}
	
	public Student(String name,int age)
	{
//		this();
		this.name = name;
		this.age = age;
		num++;
	}
	
	//Copy Constructor
	public Student(Student s)
	{
		this.name = s.name;
		this.age = s.age;
		num++;
	}
	
	public void introduceYourself()
	{
//		String name = "Hello";
		System.out.println("I am " + name +". Nice to meet You");
	}
	
	public void introduceYourself(String name)
	{
		System.out.println("I am "+ this.name +". Nice to meet "+name);
	}

}
