package Lec1;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int count  = 0;
//		while(count<5)
//		{
//			System.out.println("Hi");
//			
//			count += 1;
//		}
		
		
		int n = 5;
		int sum = 0;
		int i = 2;
		while(i<=n)
		{
			sum += i;
			i += 2;
		}
		
		System.out.println(sum);
		

	}

}
