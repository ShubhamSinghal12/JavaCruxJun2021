package Lec10;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nos = 2;
		int[] books = {12,34,67,90};
		int low = 1;
		int high = 0;
		for(int val: books)
			high += val;
		
		//Binary Search
//		System.out.println(isItPossible(books, nos, 1));
		
		int ans = 0;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(isItPossible(books, nos, mid))
			{
				ans = mid;
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		System.out.println(ans);
		

	}
	
	public static boolean isItPossible(int[] books,int nos,int max)
	{
		int students = 1;
		int nop = 0;
		for(int i = 0; i < books.length;)
		{
			if(nop+books[i] <= max)
			{
				nop += books[i];
				i++;
			}
			else {
				
				students++;
				nop = 0;
			}
			if(students > nos)
			{
				return false;
			}
		}
		return true;
		
	}

}
