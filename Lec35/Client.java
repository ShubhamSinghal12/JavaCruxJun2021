package Lec35;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
//		BinaryTree bt = new BinaryTree();
//		bt.createTree();
//		bt.display();
//		System.out.println(bt.size());
//		System.out.println(bt.ht());
//		System.out.println(bt.max());
//		System.out.println(bt.dia2());
		
		int[] in = {50,20,70,60,100,40,90,80};
		int[] pre = {100,20,50,60,70,40,80,90};
		
		BinaryTree bt = new BinaryTree();
		bt.createTreeUsingPreandIn(pre, in);
		bt.display();
		bt.leftTreeView();
		System.out.println(bt.isBalanced2());

	}

}
