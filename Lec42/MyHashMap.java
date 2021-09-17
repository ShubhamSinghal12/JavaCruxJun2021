package Lec42;

import java.util.ArrayList;

public class MyHashMap <K,V> {

	private class Node{
		
		K key;
		V value;
		Node next;
		
		Node(K key,V val)
		{
			this.key = key;
			this.value = val;
		}
		
	}
	
	ArrayList<Node> buckets;
	int size = 0;
	static final int th = 2;
	
	public MyHashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}
	public MyHashMap(int bucketSize)
	{
		buckets = new ArrayList<>();
		for(int i = 0; i < bucketSize; i++)
			buckets.add(null);
	}
	
	private int hashFn(K key)
	{
		if(key == null )
			return 0;
		int bn = key.hashCode()%buckets.size();
		if(bn<0)
			return bn+buckets.size();
		return bn;
	}
	
	
	public void put(K key, V value)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node n = new Node(key,value);
		n.next = buckets.get(bn);
		buckets.set(bn, n);
		size++;	
		
		float lf = size/buckets.size();
		if(lf>th)
		{
			rehash();
		}
	}
	
	
	public V get(K key)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
		
	}
	
	public boolean containsKey(K key)
	{
		int bn = hashFn(key);
		Node temp = buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	
	public V remove(K key)
	{
		int bn = hashFn(key);
		V val = null;
		Node temp = buckets.get(bn);
		Node prev = null;
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				val = temp.value;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
			return null;
		
		size--;
		if(prev == null)
		{
			buckets.set(bn, buckets.get(bn).next);
			return val;
		}
		else
		{
			prev.next = temp.next;
		}
		
		return val;
		
	}
	
	
	private void rehash()
	{
		ArrayList<Node> ob = this.buckets;
		ArrayList<Node> nb = new ArrayList<>();
		for(int i = 0; i < 2*ob.size(); i++)
			nb.add(null);
		
		
		this.buckets = nb;
		this.size = 0;
		
		for(Node n: ob)
		{
			while(n != null)
			{
				put(n.key,n.value);
				n = n.next;
			}
		}
	}
	
	
	@Override
	public String toString()
	{
		String st = "[ ";
		for(Node n: buckets)
		{
			while(n != null)
			{
				st += n.key+" : "+n.value+"  ,  ";
				n = n.next;
			}
		}
		
		st += " ]";
		return st;
	}
	
	
	
	
	
	
	
	
	

}
