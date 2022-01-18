package Lec54;

import java.util.HashMap;

public class Trie {

	private class Node{
		char data;
		HashMap<Character, Node> children;
		boolean isWord;
		int count;
		
		
		public Node(char data)
		{
			this.data = data;
			children = new HashMap<>();
			isWord = false;
			count = 0;
		}
	}
	
	Node root;
	public Trie()
	{
		this.root = new Node('*');
	}
	
	public void insert(String st)
	{
		Node curr = this.root;
		curr.count++;
		for(int i = 0; i < st.length(); i++)
		{
			if(curr.children.containsKey(st.charAt(i)))
			{
				curr = curr.children.get(st.charAt(i));
			}
			else
			{
				Node nn = new Node(st.charAt(i));
				curr.children.put(st.charAt(i), nn);
				curr = nn;
			}
			
			curr.count++;
		}
		curr.isWord = true;
	}
	
	public boolean search(String st)
	{
		Node curr = this.root;
		for(int i = 0; i < st.length(); i++)
		{
			if(curr.children.containsKey(st.charAt(i)))
			{
				curr = curr.children.get(st.charAt(i));
			}
			else
			{
				return false;
			}
		}
		
		return curr.isWord;
	}
	
	public boolean startsWith(String st)
	{
		Node curr = this.root;
		for(int i = 0; i < st.length(); i++)
		{
			if(curr.children.containsKey(st.charAt(i)))
			{
				curr = curr.children.get(st.charAt(i));
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public int noOfPrefix(String st)
	{
		Node curr = this.root;
		for(int i = 0; i < st.length(); i++)
		{
			if(curr.children.containsKey(st.charAt(i)))
			{
				curr = curr.children.get(st.charAt(i));
			}
			else
			{
				return -1;
			}
		}
		
		return curr.count;
	}
	
	
	
}
