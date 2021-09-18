package Lec43;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> heap = new ArrayList<Integer>(); 
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(int ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(pi)>heap.get(ci))
		{
			swap(pi,ci);
			upheapify(pi);
		}
	}
	
	private void swap(int i,int j)
	{
		int t = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, t);
	}
	
	public int get()
	{
		return heap.get(0);
	}
	
	
	public int remove()
	{
		int ans = heap.get(0);
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		
		return ans;
	}
	
	private void downheapify(int pi)
	{
		int lc = 2*pi+1;
		int rc = 2*pi+2;
		int min = pi;
		if(lc < heap.size() && heap.get(lc) < heap.get(min))
		{
			min = lc;
		}
		if(rc < heap.size() && heap.get(rc) < heap.get(min))
		{
			min = rc;
		}
		if(min != pi)
		{
			swap(min,pi);
			downheapify(min);
		}
	}
	
	public void display()
	{
		System.out.println(heap);
	}
	
	
}
