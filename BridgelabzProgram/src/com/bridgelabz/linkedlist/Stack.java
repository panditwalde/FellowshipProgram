package com.bridgelabz.linkedlist;

public class Stack {

	 static Node top; 	 	
	private class Node 
	{
		int value;
		Node next;
	} 
	
	public Stack() 
	{
		top = null;
	}
	
	public void push(int value) 
	{
		Node newnode = top;
		top = new Node();
		top.value = value;
		top.next = newnode;
	}
	public void pop()
	{
		if (top == null) 
		{
			System.out.println("Stack is Empty.");
		}
		int value =top.value;
		top = top.next;
		
	}
	public static void Display() 
	{
		Node temp = top;
		while (temp != null)
		{
			System.out.print(" "+ temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		  Display( );
		s.pop();
	      Display( );
		
	}

}
