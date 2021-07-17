package Lec11;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int minrow = 0;
		int maxrow = arr.length-1;
		int mincol = 0;
		int maxcol = arr[0].length-1;
		
		int te = arr.length*arr[0].length;
		int count = 0;
		while(count < te)
		{
			for(int i = mincol; i <= maxcol && count<te; i++)
			{
				System.out.print(arr[minrow][i]+" ");
				count++;
			}
			minrow++;
			for(int i = minrow; i <= maxrow && count<te; i++)
			{
				System.out.print(arr[i][maxcol]+" ");
				count++;
			}
			maxcol--;
			
			for(int i = maxcol; i >= mincol && count<te; i--)
			{
				System.out.print(arr[maxrow][i]+" ");
				count++;
			}
			maxrow--;
			
			for(int i = maxrow; i >= minrow && count<te; i--)
			{
				System.out.print(arr[i][mincol]+" ");
				count++;
			}
			mincol++;
		}
	}

}
