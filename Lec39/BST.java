package Lec39;


public class BST {
	
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
	
	public void createTree(int[] in)
	{
		this.root = createTree(in, 0, in.length-1);
	}
	
	private Node createTree(int[] in,int si, int ei)
	{
		if(si>ei)
			return null;
		
		
		int mid = (si+ei)/2;
		Node r = new Node(in[mid]);
		r.left = createTree(in,si,mid-1);
		r.right = createTree(in, mid+1, ei);
		
		return r;
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

	
	public boolean find(int ele)
	{
		return find(this.root,ele);
	}
	
	private boolean find(Node n,int ele)
	{
		if(n == null)
			return false;
		else
		{
			if(n.data == ele)
				return true;
			
			if(ele > n.data)
			{
				return find(n.right,ele);
			}
			else
			{
				return find(n.left,ele);
			}
		}
	}
	
	public int max()
	{
		return max(this.root);
	}
	
	private int max(Node n)
	{
		if(n.right == null)
			return n.data;
		else
			return max(n.right);
	}
	
	
	public int min()
	{
		return min(this.root);
	}
	
	private int min(Node n)
	{
		if(n.left == null)
			return n.data;
		else
			return min(n.left);
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
	
	public void add1(int ele)
	{
		if(this.root == null)
		{
			this.root = new Node(ele);
			return;
		}
		add1(this.root,ele);
	}
	
	private void add1(Node n,int ele)
	{
		if(n.data < ele)
		{
			if(n.right == null)
			{
				n.right = new Node(ele);
			}
			else
			{
				add1(n.right,ele);
			}
		}
		else
		{
			if(n.left == null)
			{
				n.left = new Node(ele);
			}
			else
			{
				add1(n.left,ele);
			}
		}
	}
	
	
	public void add2(int ele)
	{
		this.root = add2(this.root,ele);
	}
	
	private Node add2(Node n,int ele)
	{
		if(n == null)
		{
			Node r = new Node(ele);
			return r;
		}
		else
		{
			if(ele > n.data)
			{
				n.right = add2(n.right,ele);
			}
			else
			{
				n.left = add2(n.left,ele);
			}
			return n;
		}
	}
	
	public void delete(int ele)
	{
		this.root = delete(this.root,ele);
	}
	
	private Node delete(Node n,int ele)
	{
		if(n == null)
			return null;
		if(n.data < ele)
		{
			n.right = delete(n.right, ele);
		}
		else if(n.data > ele)
		{
			n.left = delete(n.left , ele);
		}
		else
		{
			if(n.left == null && n.right == null)
			{
				return null;
			}
			else if(n.left == null)
				return n.right;
			
			else if (n.right == null)
				return n.left;
			
			else
			{
				int m = min(n.right);
				n.data = m;
				n.right = delete(n.right, m);
			}
		}
		return n;
	}
	
	public void printDec()
	{
		printDec(this.root);
	}
	
	private void printDec(Node n)
	{
		if(n == null)
			return;
		else
		{
			printDec(n.right);
			System.out.print(n.data + " ");
			printDec(n.left);
		}
	}
	
	
	public void rws()
	{
		rws(this.root,0);
	}
	
	private int rws(Node n,int sum)
	{
		if(n == null)
			return sum;
		else
		{
			int rs = rws(n.right,sum);
			
			int temp = n.data;
			n.data = rs;
			
			int ls = rws(n.left,rs+temp);
			return ls;
		}
	}
	
	
	public void pir1(int low,int high)
	{
		pir1(this.root,low,high);
	}
	
	private void pir1(Node n,int low,int high)
	{
		if(n == null)
			return;
		else
		{
			pir1(n.left,low,high);
			
			if(n.data >= low && n.data <= high)
				System.out.print(n.data+" ");
			
			pir1(n.right,low,high);
		}
	}
	
	public void pir2(int low,int high)
	{
		pir2(this.root,low,high);
	}
	
	private void pir2(Node n,int low,int high)
	{
		if(n == null)
			return;
		else
		{
			if(n.data > high)
			{
				pir2(n.left,low,high);
			}
			else if (n.data < low)
			{
				pir2(n.right,low,high);
			}
			else
			{
				pir2(n.left,low,high);
				System.out.print(n.data+" ");
				pir2(n.right,low,high);
			}
		}
	}
	
	
	
	
}
