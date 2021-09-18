package Lec43;

import java.util.ArrayList;

public class GenericHeap <T extends Comparable<T>> {
	
	ArrayList<T> heap = new ArrayList<>(); 
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(T ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(ci).compareTo(heap.get(pi)) > 0)
		{
			swap(pi,ci);
			upheapify(pi);
		}
	}
	
	private void swap(int i,int j)
	{
		T t = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, t);
	}
	
	public T get()
	{
		return heap.get(0);
	}
	
	
	public T remove()
	{
		T ans = heap.get(0);
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
		if(lc < heap.size() && heap.get(lc).compareTo(heap.get(min)) > 0)
		{
			min = lc;
		}
		if(rc < heap.size() && heap.get(rc).compareTo(heap.get(min)) > 0)
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
