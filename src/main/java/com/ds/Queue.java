package com.ds;

public class Queue {

	private Integer[] q;
	int first, last;
	int size = 0;

	public Queue(int capacity){
		first=last=-1;
		q = new Integer[capacity];
	}

	public void put(int number) throws Exception{
		if(size>=q.length)
			throw new Exception("queue is full");
		
		size++;
		
		if(last==q.length-1)
			last = 0;
		else
			last++;
		q[last]=number;
	}
	
	public int get() throws Exception{
		if(size==0)
			throw new Exception("queue is empty");
		first++;
		size--;
		
		return q[first];
	}
}
