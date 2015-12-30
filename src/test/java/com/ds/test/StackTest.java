package com.ds.test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ds.Stack;

public class StackTest {

	Stack<String> stringStack;
	
	@Before
	public void setUp() throws Exception {
		stringStack = new Stack<String>();
	}

	@Test
	public void testEmptyStack() {
		//fail("Not yet implemented");
		try {
			stringStack.pop();
		}catch(Exception e){
			assertEquals(e.getMessage(),"Empty stack");
		}
	}
	
	@Test
	public void test(){
		String[] push = {"anoop","yuvika","sushma"};
		stringStack.push(push[2].toString());
		stringStack.push(push[1].toString());
		stringStack.push(push[0].toString());
		String[] ele = new String[3];
		try {
			ele[0]=stringStack.pop();
			ele[1]=stringStack.pop();
			ele[2]=stringStack.pop();
		} catch (Exception e) {
			fail("stack operation failed due to "+e.getMessage());
		}
		
		
		assertArrayEquals("stack matches",push,ele);
	}

}
