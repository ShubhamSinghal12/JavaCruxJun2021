package Lec44;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph gp = new Graph(7);
		gp.addEdge(1, 2, 10);
		gp.addEdge(1, 4, 60);
		gp.addEdge(2,3, 20);
		gp.addEdge(3, 4, 30);
		gp.addEdge(4,5, 80);
		gp.addEdge(5, 6, 90);
		gp.addEdge(6, 7, 13);
		gp.addEdge(5, 7, 14);
		
		gp.display();
		gp.removeEdge(4, 5);
//		gp.removeVertex(4);
		System.out.println("-------");
		gp.display();
		System.out.println(gp.noOfEdges());
//		System.out.println(gp.containsEdge(4, 5));
		System.out.println(gp.hasPathDFS(1, 6));
		
		gp.DFST();
		System.out.println();
		System.out.println("--------");
		
//		gp.removeEdge(2, 3);
//		gp.removeEdge(5, 6);
		
		System.out.println(gp.isCycle());
		System.out.println(gp.noOfConnectedComponenets());
		System.out.println(gp.isConnected());
//		System.out.println(gp.isTree());
		System.out.println(gp.connectedComponents());
//		gp.printPath(1, 6);
		

	}

}
