package Lec44;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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

}
