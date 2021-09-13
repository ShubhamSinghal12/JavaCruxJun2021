package Lec40;

public interface Test1 {

	abstract void hello2();
	void hello1();
	int a = 100;
	
	default void hi()
	{
		System.out.println("hi!!!!");
	}
	static void shi()
	{
		System.out.println("Hi!! using static");
	}
	
}
