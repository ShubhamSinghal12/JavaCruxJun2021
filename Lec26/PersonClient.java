package Lec26;

public class PersonClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		System.out.println(Person.i);
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("Hello.");
		
		p.setAge(10);
		p.setName("Ram");
		
		
		System.out.println(p.getName()+" "+p.getAge());
		
		Person p3 = new Person("Sid",20);
		
		System.out.println("Bye");

	}

}
