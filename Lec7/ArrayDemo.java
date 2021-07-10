package Lec7;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = new int[n];
		n = 8;
		int[] brr = new int[n];
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0] = 10;
		System.out.println(arr[0]);
		
		System.out.println(arr.length);
//		System.out.println(arr[5]);
		
		
		brr = arr;
		System.out.println(brr);
		System.out.println(brr[0]);
		brr[3] = 100;
		System.out.println(arr[3]);
		
		char[] ac = new char[5];
		
		
		int[] crr = {1,2,3,4,5};
		int[] drr = null;
		drr = new int[] {1,2,3,4,5};
		
		//EFL
		System.out.println("-----------------------");
		
		for(int val : drr)
		{
			System.out.println(val);
			
		}
		
		

	}

}
