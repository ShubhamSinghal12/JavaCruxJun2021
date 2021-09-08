package Lec38;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree2 bt = new BinaryTree2();
		bt.createTree();
		bt.display();
		System.out.println("-----------------");
		bt.linearize();
		bt.display();

	}

}
