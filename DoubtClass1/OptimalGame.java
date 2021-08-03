package DoubtClass1;

public class OptimalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,100,4};
		System.out.println(game(arr, 0, arr.length-1));

	}
	
	public static int[] playOptimal(int coins[], int first, int last, boolean turn) {
		if (first == last) {
			if (turn)
				return new int[] { coins[first], 0 };
			else
				return new int[] { 0, coins[first] };
		}

		if (turn) {
			int m1[] = playOptimal(coins, first + 1, last, !turn);
			m1[0] += coins[first];
			int m2[] = playOptimal(coins, first, last - 1, !turn);
			m2[0] = coins[last] + m2[0];
			if (m1[0] > m2[0])
				return m1;
			else
				return m2;
			
		} else {
			int m1[] = playOptimal(coins, first + 1, last, !turn);
			m1[1] += coins[first];
			int m2[] = playOptimal(coins, first, last - 1, !turn);
			m2[1] = coins[last] + m2[1];
			if (m1[1] > m2[1])
				return m1;
			else
				return m2;
		}
	}

	public static int game(int[] arr,int si,int ei)
	{
		if(si == ei)
		{
			return arr[si];
		}
		else if(si+1 == ei)
		{
			return Math.max(arr[si], arr[ei]);
		}
		else 
		{	
			int tf = arr[si]+Math.min(game(arr,si+2,ei), game(arr,si+1,ei-1));
			int tl = arr[ei]+Math.min(game(arr, si, ei-2), game(arr, si+1, ei-1));
			return Math.max(tf, tl);
		}
	}

}
