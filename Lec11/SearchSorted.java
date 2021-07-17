package Lec11;

public class SearchSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(search(arr, 20));

	}
	
	public static boolean search(int[][] arr,int ele)
	{
		int row = 0;
		int col = arr[0].length-1;
		while(row < arr.length && col >= 0)
		{
			if(arr[row][col] > ele)
			{
				col--;
			}
			else if(arr[row][col] < ele)
			{
				row++;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}
