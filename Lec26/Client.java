package Lec26;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		MyStack st = new MyStack(5);
//		for(int i = 1; i <= 5; i++)
//			st.push(i);
////		st.pop();
//		st.push(6);
//		st.display();
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		st.display();
		
		
		MyQueue qt = new MyQueue(5);
		
		for(int i = 1; i <= 4; i++)
		{
			qt.enqueue(i);
		}
		qt.display();
		System.out.println(qt.peek());
		System.out.println(qt.dequeue());
		qt.display();
		qt.dequeue();
		qt.display();
		
		qt.enqueue(5);
		qt.enqueue(6);
		
		qt.display();

	}

}
