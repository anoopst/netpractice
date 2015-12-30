package com.ds;

public class Stack<T> {
	
	Element<T> head;
	
	public void push(T object){
		head = new Element<T>(object,head);
	}

	public T pop() throws Exception{
		T top=null;
		if(head!=null){
			top = head.element;
			head = head.next;			
		} else
			throw new Exception("Empty stack");
		
		return top;
	}
	
	class Element<T>{
		T element;
		Element<T> next;
		
		public Element(T element,Element<T> head){
			this.element = element;
			this.next = head;
		}
	}
}
