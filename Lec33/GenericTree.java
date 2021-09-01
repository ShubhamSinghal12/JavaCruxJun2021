package Lec33;

import java.util.ArrayList;
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
	
	
	
}
