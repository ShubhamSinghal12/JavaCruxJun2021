package Lec19;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazePathDia(2, 2, 0, 0, ""));

	}
	
	public static void mazePath(int er,int ec,int cr,int cc,String ans)
	{
		if(cr == er && cc == ec)
		{
			System.out.println(ans);
		}
		else if(cr > er || cc > ec)
		{
			return;
		}
		else
		{
			mazePath(er, ec, cr+1, cc, ans+"V");
			mazePath(er, ec, cr, cc+1, ans+"H");
		}
	}
	public static int mazePathDia(int er,int ec,int cr,int cc,String ans)
	{
		if(cr == er && cc == ec)
		{
			System.out.println(ans);
			return 1;
		}
		else if(cr > er || cc > ec)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count+=mazePathDia(er, ec, cr+1, cc, ans+"V");
			count+=mazePathDia(er, ec, cr, cc+1, ans+"H");
			count+=mazePathDia(er, ec, cr+1, cc+1, ans+"D");
			return count;
		}
	}

}
