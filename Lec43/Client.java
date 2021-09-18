package Lec43;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap();
		h.add(30);
		h.add(20);
		h.add(10);
		h.display();
		
		h.add(7);
		h.add(100);
		h.display();
		
		h.add(50);
		h.add(200);
		h.add(35);
		h.display();
		
		System.out.println("--------------");
		while(!h.isEmpty())
		{
			System.out.print(h.remove()+" ");
			h.display();
			
		}
		
//		System.out.println(h.get());
//		h.display();
//		
//		System.out.println(h.remove());
//		h.display();
//		System.out.println(h.remove());
//		h.display();
//		
		
	}

}
