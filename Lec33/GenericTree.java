package Lec33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {

	Scanner sc = new Scanner(System.in);
	
	private class Node{
		
		int data;
		ArrayList<Node> children;
		
		Node(int val)
		{
			data = val;
			children = new ArrayList<>();
		}
		Node()
		{
			this(0);
		}
	}
	
	private Node root;
	
	
	public void createTree()
	{
		root = createTree(null,-1);
	}
	private Node createTree(Node parent,int ith)
	{
		if(parent == null)
		{
			System.out.println("Enter root node value: ");
		}
		else
			System.out.println("Enter the value of "+ith+" child of "+parent.data);
		
		int val = sc.nextInt();
		Node n = new Node(val);
		System.out.println("Enter no. of Children for this node: ");
		int noc = sc.nextInt();
		for(int i = 0; i < noc; i++)
		{
			Node child = createTree(n, i);
			n.children.add(child);
		}
		
		return n;
	}
	
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node n)
	{
		System.out.print(n.data+" --> ");
		for(int i = 0; i < n.children.size();i++)
		{
			System.out.print(n.children.get(i).data+" ");
		}
		System.out.println();
		for(Node child: n.children)
		{
			display(child);
		}
	}
	
	public int size()
	{
		return size(this.root);
	}
	
	private int size(Node n)
	{
		int count  = 0;
		for(Node child: n.children)
		{
			count += size(child);
		}
		return count+1;
	}
	public int ht()
	{
		return ht(this.root)-1;
	}
	
	private int ht(Node n)
	{
		int ht = 0;
		for(Node child:n.children)
		{
			int th = ht(child);
			ht = Math.max(th, ht);
		}
		return ht+1;
	}
	
	public boolean find(int ele)
	{
		return find(this.root,ele);
	}
	
	private boolean find(Node n,int ele)
	{
		if(n.data == ele)
			return true;
		else
		{
			for(Node child:n.children)
			{
				boolean isFind = find(child,ele);
				if(isFind)
					return true;
			}
			return false;
		}
	}
	
	public void mirror()
	{
		mirror(this.root);
	}
	
	private void mirror(Node n)
	{
		for(Node child : n.children)
		{
			mirror(child);
		}
		
		Collections.reverse(n.children);
		
	}
	
	public void preorder()
	{
		preorder(this.root);
	}
	
	private void preorder(Node n) {
		
		System.out.print(n.data+" ");
		
		for(Node child: n.children)
		{
			preorder(child);
		}
		
	}
	
	public void postorder()
	{
		postorder(this.root);
	}
	
	private void postorder(Node n) {
		
		
		for(Node child: n.children)
		{
			postorder(child);
		}
		
		System.out.print(n.data+" ");
		
	}
	
	public void levelOrder()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			
			for(Node child : n.children)
				qt.add(child);
			
			System.out.print(n.data+" ");
		}
	}
	
	
	
	
	
}
