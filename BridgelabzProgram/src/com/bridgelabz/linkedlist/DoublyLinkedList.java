package com.bridgelabz.linkedlist;


public class DoublyLinkedList {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			int data=d;
			next=null;
			prev=null;
		}
	}
	public static void  InsertAtBegin(int value)
	{
		Node tmp=new Node(value);
		tmp.data=value;
		if(head==null)
		{
			
			head=tmp;
		}
		else
		{
			tmp.next=head;
			head.prev=tmp;
			head=tmp;
		}
		
		System.out.println("Node is Insert in Beginning....");
	}
	public static void  InsertAtlast(int value)
	{
		Node tmp=new Node(value);
		tmp.data=value;
		if(head==null)
		{
			
			head=tmp;
		}
		else
		{
			Node p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=tmp;
			tmp.prev=p;
		}
		
		System.out.println("Node is Insert in Last....");
	}
	public static void InsertAtPos(int value,int pos) {
		
		Node tmp=new Node(value);
		tmp.data=value;
		if(head==null)
		{
			head=tmp;
		}
		else
		{
			Node p=head;
			for(int i=1;i<pos-1;i++)
			{
				p=p.next;
			}
			tmp.prev=p;
			tmp.next=p.next;
			p.next.prev=tmp;
			p.next=tmp;
		}
		
		
		System.out.println("Inserting At Position...");
	}
	public static void delAtbegin()
	{
		if(head==null)
		{
			System.out.println("List is  Empty");
		}
		else
		{
			Node tmp=head;
			head=head.next;
			head.prev=null;
		}
	}
	public static void delAtLast()
	{
		if(head==null)
		{
			System.out.println("List is  Empty");
		}
		else
		{
			Node tmp=head;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.prev.next=null;
		}
	}
	public static void delAtPos(int pos)
	{
		if(head==null)
		{
			System.out.println("List is  Empty");
		}
		else
		{
			Node p=head;
			for(int i=1;i<pos;i++)
			{
				p=p.next;
			}
			p.next.prev=p.prev;
			p.prev.next=p.next;
		}
	}
	public  static void display()
	{
		Node tmp;
		tmp=head;
		
		 while(tmp!=null)
		 {
			 System.out.print(" "+tmp.data);
			 tmp=tmp.next;
		 }
		 System.out.println();
		
	}

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtBegin(32);
		InsertAtBegin(42);
		display();
		InsertAtlast(22);
		InsertAtlast(72);
		display();
		InsertAtPos(92,4);
		
		display();
		delAtPos(2);
		display();
	
	
	}

}
