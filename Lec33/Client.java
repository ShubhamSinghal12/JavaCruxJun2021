package Lec33;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt = new GenericTree();
		gt.createTree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.ht());
//		gt.mirror();
//		gt.display();

//		gt.postorder();
		gt.levelOrder();
	}

}
