package Lec17;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3,"A","C","B");
	}
	
	public static void toh(int n,String from,String to,String aux)
	{
		if(n==1)
		{
			System.out.println("move disk " +n+ " from "+from+" to "+to);
		}
		else
		{
			toh(n-1,from,aux,to);
			System.out.println("move disk " +n+ " from "+from+" to "+to);
			toh(n-1,aux,to,from);
		}
	}
	
	
	

}
