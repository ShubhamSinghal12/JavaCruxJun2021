package Lec44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	HashMap<Integer, HashMap<Integer,Integer>> graph = new HashMap<>();
	
	public Graph(int v) {
		
		for(int i = 1; i <= v; i++)
		{
			graph.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int u,int v, int cost)
	{
		graph.get(u).put(v, cost);
		graph.get(v).put(u, cost);
	}
	public void addVertex(int v)
	{
		graph.put(v, new HashMap<>());
	}
	
	public int noOfEdges()
	{
		int sum = 0;
		for(int v: graph.keySet())
		{
			sum += graph.get(v).size();
		}
		return sum/2;
	}
	public int noOfVertices()
	{
		return graph.size();
	}
	
	public void removeEdge(int u,int v)
	{
		if(containsEdge(u,v))
		{
			graph.get(u).remove(v);
			graph.get(v).remove(u);
		}
	}
	
	public void removeVertex(int v)
	{
		if(graph.containsKey(v)) {
		
			for(int nbbr : graph.get(v).keySet())
			{
				graph.get(nbbr).remove(v);
			}
			graph.remove(v);
		}
	}
	
	
	public boolean containsEdge(int u, int v)
	{
		return graph.get(u).containsKey(v) && graph.get(v).containsKey(u);
	}
	
	public boolean containsVertex(int v)
	{
		return graph.containsKey(v);
	}
	
	public void display()
	{
		for(int v: graph.keySet())
		{
			System.out.println(v+" : "+graph.get(v));
		}
	}
	
	public boolean hasPath(int u,int v)
	{
		return hasPath(u,v,new HashSet<>());
	}
	
	private boolean hasPath(int u,int v,HashSet<Integer> visited)
	{
		
		if(u == v) {
			
			System.out.println(visited);
			return true;
		}
		visited.add(u);
		for(int nbbr: graph.get(u).keySet())
		{
			if(!visited.contains(nbbr))
			{
				if(hasPath(nbbr,v,visited))
					return true;
			}
		}
		return false;
	}
	
	public void printPath(int u,int v)
	{
		printPath(u,v,new HashSet<>(),"");
	}
	
	private void printPath(int u,int v,HashSet<Integer> visited,String ans)
	{
		
		if(u == v) {
			
			System.out.println(ans+u);
		}
		
		visited.add(u);
		for(int nbbr: graph.get(u).keySet())
		{
			if(!visited.contains(nbbr))
			{
				printPath(nbbr,v,visited,ans+u+" ");
			}
		}
		visited.remove(u);
		
	}
	
	public boolean hasPathBFS(int u,int v)
	{
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> qt = new LinkedList<>();
		
		qt.add(u);
		
		while(!qt.isEmpty())
		{
			int r = qt.remove();
			
			if(r == v)
				return true;
			
			if(visited.contains(r))
			{
				continue;
			}
			else
			{
				visited.add(r);
				for(int nbbr: graph.get(r).keySet())
				{
					if(!visited.contains(nbbr)){
						qt.add(nbbr);
					}
				}
			}
		}
		
		return false;
	}
	
	
	public boolean hasPathDFS(int u,int v)
	{
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> qt = new Stack<>();
		
		qt.push(u);
		
		while(!qt.isEmpty())
		{
			int r = qt.pop();
			
			if(r == v)
			{
				System.out.println(qt);
				return true;
			}
			if(visited.contains(r))
			{
				continue;
			}
			else
			{
				visited.add(r);
				for(int nbbr: graph.get(r).keySet())
				{
					if(!visited.contains(nbbr)){
						qt.add(nbbr);
					}
				}
			}
		}
		
		return false;
	}

	
	
	
	public void BFST()
	{
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> qt = new LinkedList<>();
		
		for(int n: graph.keySet())
		{
			if(visited.contains(n))
				continue;
			else
				qt.add(n);
			
			while(!qt.isEmpty())
			{
				int r = qt.remove();
				
				
				if(visited.contains(r))
				{
					continue;
				}
				else
				{
					visited.add(r);
					System.out.print(r+" ");
					for(int nbbr: graph.get(r).keySet())
					{
						if(!visited.contains(nbbr)){
							qt.add(nbbr);
						}
					}
				}
			}
		}
		
	}
	
	public void DFST()
	{
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> qt = new Stack<>();
		
		for(int n: graph.keySet())
		{
			if(visited.contains(n))
				continue;
			else
				qt.push(n);
			
			while(!qt.isEmpty())
			{
				int r = qt.pop();
				
				
				if(visited.contains(r))
				{
					continue;
				}
				else
				{
					visited.add(r);
					System.out.print(r+" ");
					for(int nbbr: graph.get(r).keySet())
					{
						if(!visited.contains(nbbr)){
							qt.add(nbbr);
						}
					}
				}
			}
		}
		
	}
	
	
	public boolean isCycle()
	{
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> qt = new LinkedList<>();
		
		for(int n: graph.keySet())
		{
			if(visited.contains(n))
				continue;
			else
				qt.add(n);
			
			while(!qt.isEmpty())
			{
				int r = qt.remove();
				
				
				if(visited.contains(r))
				{
					return true;
				}
				else
				{
					visited.add(r);
					for(int nbbr: graph.get(r).keySet())
					{
						if(!visited.contains(nbbr)){
							qt.add(nbbr);
						}
					}
				}
			}
		}
		return false;	
	}
	
	
	public int noOfConnectedComponenets()
	{
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> qt = new LinkedList<>();
		
		int count = 0;
		for(int n: graph.keySet())
		{
			if(visited.contains(n))
				continue;
			else
				qt.add(n);
			
			count++;
			while(!qt.isEmpty())
			{
				int r = qt.remove();
				
				
				if(visited.contains(r))
				{
					continue;
				}
				else
				{
					visited.add(r);
					for(int nbbr: graph.get(r).keySet())
					{
						if(!visited.contains(nbbr)){
							qt.add(nbbr);
						}
					}
				}
			}
		}
		return count;	
	}
	
	public boolean isConnected()
	{
		return noOfConnectedComponenets() == 1;
	}
	
	public boolean isTree()
	{
		return !isCycle() && isConnected();
	}
	
	public ArrayList<ArrayList<Integer>> connectedComponents(){
		
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> qt = new LinkedList<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for(int n: graph.keySet())
		{
			if(visited.contains(n))
				continue;
			else
				qt.add(n);
			
			ArrayList<Integer> component = new ArrayList<Integer>();
			while(!qt.isEmpty())
			{
				int r = qt.remove();
				
				
				if(visited.contains(r))
				{
					continue;
				}
				else
				{
					visited.add(r);
					component.add(r);
					for(int nbbr: graph.get(r).keySet())
					{
						if(!visited.contains(nbbr)){
							qt.add(nbbr);
						}
					}
				}
			}
			ans.add(component);
		}
		return ans;
		
	}
	
	
	private class DisjointSets{
		
		private class Node{
			int data;
			int rank;
			Node parent;
			
			public Node(int data,int rank)
			{
				this.data = data;
				this.rank = rank;
			}
		}
		
		private HashMap<Integer, Node> ds = new HashMap<>();
		
		public void createSet(int value)
		{
			Node nn = new Node(value,0);
			nn.parent = nn;
			ds.put(value, nn);
		}
		
		public int find(int value)
		{
			Node f = ds.get(value);
			return find(f).data;
		}
		
		private Node find(Node n)
		{
			if(n.parent == n)
				return n;
			else
				return find(n.parent);
		}
		
		public void union(int u,int v)
		{
			Node r1 = ds.get(u);
			Node r2 = ds.get(v);
			
			Node re1 = find(r1);
			Node re2 = find(r2);
			
			if(re1!=re2)
			{
//				System.out.println("InUnion: "+ re1.data+" "+re1.rank +" "+re1.parent.data+" "+re2.data+" "+re2.rank+ " "+ re2.parent.data);
				if(re1.rank > re2.rank)
				{
					re2.parent = re1;
				}
				else if ( re1.rank < re2.rank)
				{
					re1.parent = re2;
				}
				else
				{
					re2.parent = re1;
					re1.rank++;
				}
			}
			
		}
		
	}
	
	
	private class EdgePair{
		int u;
		int v;
		int cost;
		
		public EdgePair(int u,int v,int cost)
		{
			this.u = u;
			this.v = v;
			this.cost = cost;
		}
		
		public String toString()
		{
			return this.u +" --> "+this.v+" @ "+this.cost;
		}
	}
	
	public ArrayList<EdgePair> allEdges()
	{
		ArrayList<EdgePair> ll = new ArrayList<>();
		for(int u:graph.keySet())
		{
			for(int v: graph.get(u).keySet())
			{
				EdgePair edge = new EdgePair(u, v, graph.get(u).get(v));
				ll.add(edge);
			}
		}
		return ll;
	}
	
	public void Kruskals()
	{
		DisjointSets djs = new DisjointSets();
		for(int v:graph.keySet())
		{
			djs.createSet(v);
		}
		
		ArrayList<EdgePair> al = allEdges();
		
		Collections.sort(al,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		for(EdgePair edge:al)
		{
			int r1 = djs.find(edge.u);
			int r2 = djs.find(edge.v);
			if(r1 != r2)
			{
				System.out.println(edge);
				djs.union(edge.u, edge.v);
				
			}
		}
	}
	
	
	private class PrimsPair{
		int vtx;
		int via;
		int cost;
		
		public PrimsPair(int vtx,int via,int cost)
		{
			this.via = via;
			this.vtx = vtx;
			this.cost = cost;
		}
		
		public String toString()
		{
			return this.vtx + " via "+ this.via + " @ " + this.cost;
		}
		
	}
	
	public void Prims()
	{
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> qt = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		qt.add(new PrimsPair(1, 0, 0));
		
		while(!qt.isEmpty())
		{
			PrimsPair r = qt.remove();
			
			if(visited.contains(r.vtx))
			{
				continue;
			}
			
			visited.add(r.vtx);
			if(r.cost != 0)
				System.out.println(r);
			for(int nbbr:graph.get(r.vtx).keySet())
			{
				if(!visited.contains(nbbr))
				{
					qt.add(new PrimsPair(nbbr, r.vtx, graph.get(r.vtx).get(nbbr)));
				}
			}
		}
		
	}
	
	
	private class DijkstraPair{
		int vtx;
		String via;
		int cost;
		
		public DijkstraPair(int vtx,String via,int cost)
		{
			this.via = via;
			this.vtx = vtx;
			this.cost = cost;
		}
		
		public String toString()
		{
			return this.vtx + " via "+ this.via + " @ " + this.cost;
		}
		
	}
	
	public void Dijkstra()
	{
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> qt = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		qt.add(new DijkstraPair(1, "", 0));
		
		while(!qt.isEmpty())
		{
			DijkstraPair r = qt.remove();
			
			if(visited.contains(r.vtx))
			{
				continue;
			}
			
			visited.add(r.vtx);
			if(r.cost != 0)
				System.out.println(r);
			for(int nbbr:graph.get(r.vtx).keySet())
			{
				if(!visited.contains(nbbr))
				{
					qt.add(new DijkstraPair(nbbr, r.via+" "+r.vtx, r.cost + graph.get(r.vtx).get(nbbr)));
				}
			}
		}
		
	}


	
	
	
}
