package Lec55;

public class UniqueNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,4,3,2,3,5,7,5,4};
		int a = 0;
		for(int val : arr)
		{
			a = a^val;
		}
		System.out.println(a);

	}
	
	

}
