package com.ds.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ds.Queue;

public class QueueTest {
	
	public Queue q;

	@Before
	public void setUp() throws Exception {
		q = new Queue(5);
	}

	@Test
	public void test() throws Exception {
		try{
			q.get();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		q.put(1);
		q.put(2);
		q.put(3);
		assertEquals(1,q.get());
		assertEquals(2,q.get());
		q.put(4);
		q.put(5);
		q.put(6);
		q.put(7);
		try{
			q.put(8);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
