package DoubtClass1;

public class GenerateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,15,25};
		int[] b = {1,5,20,30};
		gsa(a, b, 0, 0, true, "", Integer.MIN_VALUE);
	}
	
	public static void gsa(int[] a,int[] b,int i,int j,boolean turn,String ans,int last)
	{
		if(turn)
		{
			//Work for A
			if(ans.length()!=0)
			{
				System.out.println(ans);
			}
			for(int k = i; k < a.length; k++)
			{
				if(a[k] >= last)
				{
					gsa(a,b,k+1,j,false,ans+a[k]+" ",a[k]);
				}
			}
		}
		else {
			//Work for B
			
			for(int k = j; k < b.length;k++)
			{
				if(b[k] >= last)
				{
					gsa(a, b, i, k+1, true, ans+b[k]+" ", b[k]);
				}
			}
		}
	}

}
