package Lec27;

import Lec26.MyQueue;
import Lec26.MyStack;

public class DSClient {

	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
//		MyStack st = new DynamicStack();
////		st.push(10);
////		st.display();
//		for(int i =1; i <= 20; i++)
//		{
//			st.push(i);
//			st.display();
//		}
//		st.pop();
//		st.display();
		
		MyQueue qt = new DynamicQueue();
		for(int i = 1; i <= 20; i++)
		{
			qt.enqueue(i);
			qt.display();
		}

	}

}
