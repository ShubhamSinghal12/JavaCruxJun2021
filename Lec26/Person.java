package Lec26;

public class Person {

	private String name;
	private int age;
	static int i = 10;

	//init
	{
		System.out.println("In init block"+name);
	}
	
	public Person()
	{
		System.out.println("In default Constructor");
	}
//	
	public Person(String name,int age) 
	{
		try {
			setName(name);
			setAge(age);
			return;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			age = 0;
		}
		
		finally {
			System.out.println("In finally");
		}
		
		System.out.println("In parameterized");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) throws Exception
	{
			if(age<0 || age > 100)
			{
				throw new Exception("Invalid Age");	
			}
			this.age = age;
		
	}
	
	
	static {	
		i = 11;
		System.out.println("In static block"+i);
	}
	
	
	
	
	
}
