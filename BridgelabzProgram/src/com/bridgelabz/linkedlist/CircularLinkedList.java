package com.bridgelabz.linkedlist;

public class CircularLinkedList {
	
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=next;
			
		}
	}
	public static void  InsertAtBegin(int value)
	{
		Node tmp;
		
		
		Node newnode = new Node(value);
		if(head==null)
		{
			head = newnode;
			newnode.next=head;
		}
		else
		{
			newnode.next=head.next;
			head.next=newnode;
			
			/*tmp=head;
			while(tmp.next!= head)
			{
				tmp=tmp.next;
			}
			
			newnode.next=head;
			tmp.next=newnode;
			head=newnode;*/	
			
		}
	}
		public static void  InsertAtLast(int value)
		{
			
			
			
			Node newnode = new Node(value);
			if(head==null)
			{
				head = newnode;
				 
			}
			else
			{
				
				newnode.next=head.next;
				head.next=newnode;
				head=newnode;
			
			}
		
		
		
		System.out.println("Node is Insert in Last..");
	}

		public static void InsertAtPos(int value,int pos)
		{
			Node newnode = new Node(value);
			if(head==null)
			{
				head = newnode;
				newnode.next=head;
			}
			else
			{
				Node tmp=head;
				for(int i=1;i<pos;i++)
				{
					tmp=tmp.next;
				}
				newnode.next=tmp.next;
				tmp.next=newnode;
			}
			
		}
		
		public static void delAtbegin()
		{
			if(head==null)
			{
				System.out.println("List is Empty...");
			}
			else
			{
				Node tmp=head,p=head;
				while(p.next!= head)
				{
					p=p.next;
				}
				head= tmp.next;
				p.next=head;
				tmp.next= null;
			}
			
		}
		public static void delAtlast()
		{
			if(head==null)
			{
				System.out.println("List is Empty...");
			}
			else
			{
				Node tmp=head,p=null;
				while(tmp.next!= head)
				{
					p=tmp;
					tmp=tmp.next;
				}
				p.next=tmp.next;
				System.out.println(p.data);
				
			}

			
		}
		public static void delAtpos(int pos)
		{
			if(head==null)
			{
				System.out.println("List is Empty...");
			}
			else
			{
				Node tmp=head;
				for(int i=1;i<pos-1;i++)
				{
			
					tmp=tmp.next;
				}
				tmp.next=tmp.next.next;
				
			}

			
		}
		
	public static void display()
	{
		
		Node tmp=head.next;
		if(head == null)
		{
			System.out.println("The List is Empty");
		}
		else
		{
						
			while(tmp!=head)
			{
				System.out.print(" "+tmp.data);
				tmp=tmp.next;
			}
			System.out.println(" "+ head.data);
			
			
		}	
		System.out.println();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 InsertAtBegin(10);
		 InsertAtLast(322233);
         display();
         InsertAtBegin(20);
         InsertAtBegin(30);
         InsertAtBegin(40);
         InsertAtBegin(60);
        
        display();
        
       
         InsertAtPos(43, 4);
         InsertAtLast(444);
         display ();
         InsertAtBegin(70);
         display ();
         InsertAtLast(333);
         display();
         InsertAtBegin(4440);
         display ();


	} 

}
