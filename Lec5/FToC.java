package Lec5;

public class FToC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 100;
		int min = 0;
		int step = 20;
		for(int f = min; f <= max; f+=step)
		{
//			int c = (int)(5/9f*(f-32));
			int c = 5*(f-32)/9;
			System.out.println(f+ " -> "+c);
			
		}
		

	}

}
