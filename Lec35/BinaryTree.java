package Lec35;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;





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
	
	public int max()
	{
		return max(this.root);
	}
	
	private int max(Node n)
	{
		if(n == null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return Math.max(n.data, Math.max(max(n.left), max(n.right)));
		}
	}
	
	public void preorder()
	{
		preorder(this.root);
	}
	
	private void preorder(Node n)
	{
		if(n == null)
			return;
		
		System.out.print(n.data+" ");
		preorder(n.left);
		preorder(n.right);
		
	}
	
	public void postorder()
	{
		postorder(this.root);
	}
	
	private void postorder(Node n)
	{
		if(n == null)
			return;
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+" ");
		
	}
	
	public void inorder()
	{
		inorder(this.root);
	}
	
	private void inorder(Node n)
	{
		if(n == null)
			return;
		
		inorder(n.left);
		System.out.print(n.data+" ");
		inorder(n.right);
	}
	
	public void levelOrder()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			
			if(n.left != null)
				qt.add(n.left);
			if(n.right != null)
				qt.add(n.right);
			
			System.out.print(n.data+" ");
		}
	}
	
	public void levelbylevelOrder()
	{
		Queue<Node> qt = new LinkedList<>();
		Queue<Node> temp = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			
			if(n.left != null)
				temp.add(n.left);
			if(n.right != null)
				temp.add(n.right);
			
			System.out.print(n.data+" ");
			if(qt.isEmpty())
			{
				System.out.println();
				qt = temp;
				temp = new LinkedList<>();
			}
		}
	}
	
	public void zigzagOrder()
	{
		LinkedList<Node> qt = new LinkedList<>();
		LinkedList<Node> temp = new LinkedList<>();
		qt.add(root);
		int lvl = 0;
		while(!qt.isEmpty())
		{
			Node n = qt.removeFirst();
			
			if(lvl %2 == 0)
			{	
				if(n.left != null)
					temp.addFirst(n.left);
				if(n.right != null)
					temp.addFirst(n.right);
			}
			else
			{
				if(n.right != null)
					temp.addFirst(n.right);
				if(n.left != null)
					temp.addFirst(n.left);
			}
			System.out.print(n.data+" ");
			if(qt.isEmpty())
			{
				lvl++;
				System.out.println();
				qt = temp;
				temp = new LinkedList<>();
			}
		}
	}
	
	public int dia()
	{
		return dia(this.root);
	}
	
	private int dia(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else
		{
			int l = dia(n.left);
			int r = dia(n.right);
			int d = ht(n.left)+ht(n.right)+3;
			
			return Math.max(l, Math.max(r, d));
		}
	}
	
	private class diaPair{
		int ht = -1;
		int dia = 0;
	}
	
	public int dia2()
	{
		return dia2(this.root).dia;
	}
	
	private diaPair dia2(Node n) {
		if(n == null)
		{
			return new diaPair();
		}
		else
		{
			diaPair l = dia2(n.left);
			diaPair r = dia2(n.right);
			
			diaPair d = new diaPair();
			
			int sd = l.ht + r.ht + 2;
			
			d.dia = Math.max(sd, Math.max(l.dia, r.dia));
			
			d.ht = Math.max(l.ht, r.ht)+1;
			
			return d;
			
			
		}
		
	}
	
	
	public boolean isBalanced()
	{
		return isBalanced(this.root);
	}
	
	private boolean isBalanced(Node n)
	{
		if(n == null)
		{
			return true;
		}
		else
		{
			boolean isb = true;
			if(Math.abs(ht(n.left)-ht(n.right)) > 1)
			{
				isb = false;
			}
			
			return isb && isBalanced(n.left) && isBalanced(n.right);
		}
	}
	
	
	private class isBalPair{
		int ht = -1;
		boolean isb = true;
	}
	
	
	public boolean isBalanced2()
	{
		return isBalanced2(this.root).isb;
	}
	
	private isBalPair isBalanced2(Node n)
	{
		if(n == null)
		{
			return new isBalPair();
		}
		else
		{
			isBalPair tn = new isBalPair();
			isBalPair l = isBalanced2(n.left);
			isBalPair r = isBalanced2(n.right);
			
			if(Math.abs(l.ht-r.ht) > 1)
				tn.isb = false;
			
			tn.isb = tn.isb && l.isb && r.isb;
			
			tn.ht = Math.max(l.ht, r.ht)+1;
			
			return tn;
		}
		
	}
	
	
	public void createTreeUsingPreandIn(int[] pre,int[] in)
	{
		this.root = createTree(pre, in, 0, pre.length-1, 0, in.length-1);
	}
	
	private Node createTree(int[] pre,int[] in,int plo,int phi,int inlo,int inhi)
	{
		if(inlo > inhi)
		{
			return null;
		}
		else
		{
			Node nn = new Node(pre[plo]);
			int idx = searchIn(in,inlo,inhi,pre[plo]);
			nn.left = createTree(pre,in, plo+1, plo+idx-inlo, inlo, idx-1);
			nn.right = createTree(pre,in, plo+idx-inlo+1, phi, idx+1, inhi);
			return nn;
		}
		
	}
	
	private int searchIn(int[] arr, int si, int ei, int item)
	{
		for(int i = si; i <= ei; i++)
		{
			if(arr[i] == item)
				return i;
		}
		return -1;
	}
	
	
	
	static int max_lvl_visited;
	
	public void leftTreeView()
	{
		max_lvl_visited = -1;
		leftTreeView(root, 0);
		System.out.println();
	}
	
	private void leftTreeView(Node n,int lvl)
	{
		if(n == null)
			return;
		
		if(lvl > max_lvl_visited)
		{
			max_lvl_visited = lvl;
			System.out.print(n.data+" ");
		}
		
		leftTreeView(n.left, lvl+1);
		leftTreeView(n.right, lvl+1);
	}
	
	
	
	
	public boolean isBST1()
	{
		return isBST1(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBST1(Node n,int low,int high)
	{
		if(n == null)
		{
			return true;
		}
		else
		{
			if(n.data < low || n.data > high)
				return false;
			else
			{
				return isBST1(n.left,low,n.data) && isBST1(n.right,n.data,high);
			}
		}
	}
	
	
	public int min()
	{
		return min(this.root);
	}
	
	private int min(Node n)
	{
		if(n == null)
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return Math.min(n.data, Math.min(min(n.left), min(n.right)));
		}
	}
	
	public boolean isBST2()
	{
		return isBST2(this.root);
	}
	
	private boolean isBST2(Node n)
	{
		if(n == null)
			return true;
		else
		{
			boolean isb = true;
			isb = isb && isBST2(n.left);
			isb = isb && isBST2(n.right);
			if(isb)
			{
				int max = max(n.left);
				int min = min(n.right);
				if(n.data < max || n.data > min)
					isb = false;
			}
			return isb;
		}
	}
	
	private class isBST{
		
		boolean isb = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
	}
	
	public boolean isBST3()
	{
		return isBST3(this.root).isb;
	}
	
	private isBST isBST3(Node n)
	{
		if(n == null)
			return new isBST();
		else
		{
			isBST ans = new isBST();
			isBST l = isBST3(n.left);
			isBST r = isBST3(n.right);
			
			boolean b = true;
			if(n.data < l.max || n.data > r.min)
				b = false;
			
			ans.isb = b && l.isb && r.isb;
			
			ans.max = Math.max(n.data,Math.max(l.max, r.max));
			ans.min = Math.min(n.data,Math.min(l.min, r.min));
			
			return ans;
		}
	}
	
private class CBSTinBT{
		
		boolean isb = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int size = 0;
		
	}
	
	public int BSTinBT()
	{
		return BSTinBT(this.root).size;
	}
	
	private CBSTinBT BSTinBT(Node n)
	{
		if(n == null)
			return new CBSTinBT();
		else
		{
			CBSTinBT ans = new CBSTinBT();
			CBSTinBT l = BSTinBT(n.left);
			CBSTinBT r = BSTinBT(n.right);
			
			boolean b = true;
			if(n.data < l.max || n.data > r.min)
				b = false;
			
			ans.isb = b && l.isb && r.isb;
			
			ans.max = Math.max(n.data,Math.max(l.max, r.max));
			ans.min = Math.min(n.data,Math.min(l.min, r.min));
			
			if(ans.isb)
			{
				ans.size = l.size+r.size+1;
			}
			else
			{
				ans.size = Math.max(l.size, r.size);
			}
			return ans;
		}
	}
	
	
	public void verticalOrder()
	{
		TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>();
		verticalOrder(this.root,0,map);
		for(int val: map.keySet())
		{
			System.out.println(map.get(val));
		}
	}
	
	private void verticalOrder(Node n, int lvl, TreeMap<Integer,LinkedList<Integer>> map)
	{
		if(n == null)
			return;
		else
		{
			if(map.containsKey(lvl))
			{
				map.get(lvl).add(n.data);
			}
			else
			{
				map.put(lvl, new LinkedList<>(Arrays.asList(n.data)));
			}
			
			verticalOrder(n.left, lvl-1, map);
			verticalOrder(n.right, lvl+1, map);
		}
	}
	

	private class TopPair{
		int data;
		int depth;
		
		TopPair(int d,int de)
		{
			data =d;
			depth =de;
		}
	}
	
	public void TopView()
	{
		TreeMap<Integer, TopPair> map = new TreeMap<>();
		TopView(this.root,0,0,map);
		for(int val: map.keySet())
		{
			System.out.println(map.get(val).data);
		}
	}
	
	private void TopView(Node n, int lvl, int depth,TreeMap<Integer,TopPair> map)
	{
		if(n == null)
			return;
		else
		{
			if(map.containsKey(lvl) && map.get(lvl).depth > depth)
			{
				map.put(lvl, new TopPair(n.data,depth));
			}
			else
			{
				map.put(lvl, new TopPair(n.data,depth));
			}
			
			TopView(n.left, lvl-1, depth+1,map);
			TopView(n.right, lvl+1, depth+1,map);
		}
	}
}
