package Lec35;

import java.util.Scanner;



public class BinaryTree {
	
	Scanner sc = new Scanner(System.in); 
	private class Node{
		
		int data;
		Node left,right;
		
		Node(int val)
		{
			data = val;
			left = right = null;
		}
		Node()
		{
			this(0);
		}
		
	}
	
	private Node root;
	
	public void createTree()
	{
		root = createTree(null,"");
	}
	
	private Node createTree(Node parent,String lr)
	{
		if(parent == null)
		{
			System.out.println("Enter root node value: ");
		}
		else
			System.out.println("Enter the value of "+ lr +" child of "+parent.data);
		
		int val = sc.nextInt();
		Node n = new Node(val);
		
		System.out.println("Is there a left child of node " + n.data +" : ");
		boolean f = sc.nextBoolean();
		if(f)
		{
			n.left = createTree(n,"left");
		}
		
		System.out.println("Is there a right child of node " + n.data +" : ");
		f = sc.nextBoolean();
		if(f)
		{
			n.right = createTree(n,"right");
		}
		
		return n;
	}
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node n)
	{
		if(n.left != null)
			System.out.print(n.left.data+ " ");
		
		System.out.print("<-- "+n.data+" --> ");
		
		if(n.right != null)
			System.out.print(n.right.data+" ");
		
		
		System.out.println();
		
		if(n.left != null)
			display(n.left);
		
		if(n.right!= null)
			display(n.right);
	}
	public int size()
	{
		return size(this.root);
	}
	
	private int size(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += size(n.left);
			count += size(n.right);
			return count+1;
		}
	}
	
	public int ht()
	{
		return ht(this.root);
	}
	
	private int ht(Node n)
	{
		if(n == null)
		{
			return -1;
		}
		else
		{
			
			int ht = Math.max(ht(n.right),ht(n.left));
			return ht+1;
			
		}
		
		
	}
	
	
	

}
