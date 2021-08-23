package Lec29;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		QueueUsingStack qt = new QueueUsingStack();
		
		for(int i = 1; i <= 5; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		
		for(int i = 1; i <= 5; i++)
		{
			qt.dequeue();
			qt.display();
		}

	}

}
