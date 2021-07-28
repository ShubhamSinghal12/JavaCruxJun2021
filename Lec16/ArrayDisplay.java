package Lec16;

public class ArrayDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,5,4};
		rdisplay(arr,0);

	}
	
	public static void display(int[] arr,int id)
	{
		if(id == arr.length-1)
		{
			System.out.println(arr[id]);
			return;
		}
		else
		{
			System.out.println(arr[id]);
			display(arr,id+1);
		}
	}
	public static void rdisplay(int[] arr,int id)
	{
		if(id == arr.length-1)
		{
			System.out.println(arr[id]);
			return;
		}
		else
		{
			rdisplay(arr,id+1);
			System.out.println(arr[id]);
		}
	}

}
