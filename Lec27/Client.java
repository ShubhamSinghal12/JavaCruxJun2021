package Lec27;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parent p = new Parent();
//		Child c = new Child();
		
		System.out.println("--------------Case 1------------");
		Parent obj1 = new Parent();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
//		System.out.println(obj1.d2);
		obj1.fun();//Parent class
		obj1.fun1();//Parent class
//		obj1.fun2();
		
		System.out.println("--------------Case 2------------");
		Parent obj2 = new Child();
		System.out.println(((Child)obj2).d); //Parent
		System.out.println(obj2.d1); //Parent
		System.out.println(((Child)obj2).d2);
		obj2.fun();//Child class
		obj2.fun1();//Parent class
		((Child)obj2).fun2();
		
//		System.out.println("--------------Case 3------------");
//		Child obj3 = new Parent();
//		System.out.println(obj3.d); //Parent
//		System.out.println(obj3.d1); //Parent
//		System.out.println(obj3.d2);
//		obj3.fun();//Child class
//		obj3.fun1();//Parent class
//		obj3.fun2();
		
		System.out.println("--------------Case 4------------");
		Child obj4 = new Child();
		System.out.println(((Parent)obj4).d); //Child---Parent
		System.out.println(obj4.d1); //Parent
		System.out.println((obj4).d2); // Child
		((Parent)obj4).fun();//Child class
		obj4.fun1();//Parent class
		(obj4).fun2();//Child
		

	}

}
