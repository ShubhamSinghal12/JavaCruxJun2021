package Lec39;

public class Client {

	public static void main(String[] args) {
		
		int[] in = {10,20,30,40,50,60,70};
		BST bt = new BST();
		bt.createTree(in);
		bt.display();
//		System.out.println(bt.find(70));
//		bt.add2(55);
		System.out.println("----------------");
//		bt.display();
//		System.out.println("------------------");
//		bt.delete(40);
//		bt.display();
//		System.out.println("------------------");
//		bt.printDec();
//		System.out.println();
		
//		bt.rws();
//		bt.display();
		
		bt.pir2(20, 50);
		
	}
}
