package Lec40;

public class Demo implements Test1,Test2{

	@Override
	public void hello2() {
		// TODO Auto-generated method stub
		System.out.println("In Demo");
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(Test1.a);
		Test1 t1 = new Demo();
		t1.hello2();
		t1.hi();
		t1.hello1();
		Test2 te2 = new Demo();
		te2.hello2();
//		te2.hello1();
		
		
		Test2 t2 = new Test2() {
			
			@Override
			public void hello2() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous class");
				
			}
		};
		
		t2.hello2();
		
		
	}


	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("Hello 1");
		
	}
	

	

	

}
