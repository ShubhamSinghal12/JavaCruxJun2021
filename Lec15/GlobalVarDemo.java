package Lec15;

public class GlobalVarDemo {

	public static int val = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		displayVal();
		System.out.println(val);

	}
	public static void displayVal()
	{
		int val = 20;
		System.out.println(val);
		System.out.println(GlobalVarDemo.val);
		GlobalVarDemo.val = 100;
	}
	

}
