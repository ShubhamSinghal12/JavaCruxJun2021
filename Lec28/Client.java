package Lec28;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackUsingQueue sqt = new StackUsingQueue();
		for(int i = 1; i <= 10; i++)
		{
			sqt.push(i);
		}
		sqt.display();
		while(!sqt.isEmpty())
		{
			sqt.pop();
			sqt.display();
		}

	}

}
