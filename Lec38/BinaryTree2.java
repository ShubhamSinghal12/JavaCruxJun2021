package Lec38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BinaryTree2 {
	
	
	// 1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
	
	
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
	
	// 1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
	public void createTree()
	{
		int n = sc.nextInt();
		root = new Node(n);
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node k = qt.remove();
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			if(l != -1)
			{
				k.left = new Node(l);
				qt.add(k.left);
			}
			if(r != -1)
			{
				k.right = new Node(r);
				qt.add(k.right);
			}
		}
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
	
	
	public void linearize()
	{
		linearize(this.root);
	}
	
	private void linearize(Node n)
	{
		if(n == null)
			return;
		else
		{
			linearize(n.left);
			linearize(n.right);
			
			Node l = getLeftMostNode(n);
			l.left = n.right;
			n.right = null;
			
		}
	}
	
	private Node getLeftMostNode(Node n)
	{
		if(n.left == null)
			return n;
		else
			return getLeftMostNode(n.left);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
