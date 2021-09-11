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
		
//		int[] in = {10,20,30,40,50,60,70};
//		int[] pre = {40,20,10,30,60,50,70};
//		
		int[] in = {15,20,50,10,25,30,35,40};
		int[] pre = {10,20,15,50,30,25,40,35};
		BinaryTree bt = new BinaryTree();
		bt.createTreeUsingPreandIn(pre, in);
		bt.display();
//		bt.leftTreeView();
		System.out.println(bt.isBalanced2());
		System.out.println(bt.isBST3());
		System.out.println(bt.BSTinBT());

	}

}
