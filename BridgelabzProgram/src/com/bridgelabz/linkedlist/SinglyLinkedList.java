package com.bridgelabz.linkedlist;

public class SinglyLinkedList {
	static Node head;
	
	static class Node{
		
		int  data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	
	public  static void InsertAtbegin(int value)
	{
		Node tmp=new Node(value);
	
		tmp.next=head;
		head=tmp;
	}
	public  static void print()
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
	public  static void InsertAtlast(int value)
	{
		Node tmp=new Node(value);
		tmp.data=value;
		  if(head==null)
		  {
			  head=tmp;
		  }
		else {
			Node p = head;
			while (p.next != null) 
			{
				p = p.next;
			}

			p.next = tmp;

		}
	}
	public static void InsetAtPos(int value,int pos)
	{
        Node tmp=new Node(value);
        if(head==null)
        {
        	head=tmp;
        }
        else {
        	Node p=head;
        	for(int i=0;i<pos-2;i++)
        	{
        		p=p.next;
        	}
        	tmp.next=p.next;
        	p.next=tmp;
        }
        
	}
	
	public static void delAtBegin()
	{
		Node tmp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
		   if(head.next==null) {
			   
			   head=null;
		   }	
		   else {
             head=tmp.next;			   
		   }
		}
	}
	public static void delAtlast()
	{
		
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{  
			Node tmp=head;
		
			while(tmp.next.next!=null)
			{   
				tmp=tmp.next;
			}
			tmp.next=null;
			
		}
	}
	public static void delAtPos(int pos)
	{
		Node tmp=head,p;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else if(pos==0)
		{
			head=head.next;			
		}
		else {
			for(int i=0;i<pos-1;i++)
			{
				tmp=tmp.next;
			}
			tmp.next=tmp.next.next;
		}
			
		
	}
	public static void duplicateremove()
	{
		Node p,q,dup;
		p=head;
		while(p!=null && p.next!=null)
		{
			q=p;
			while(q.next!=null)
			{
				if(p.data==q.next.data)
				{
					dup=q.next;
					q.next=q.next.next;
				}
				else
				{
					q=q.next;
				}
			}
			p=p.next;
		}
		
	}
	public static void middle()
	{
	   Node p=head,q=head;
	   while(p!=null && q.next==null)
	   {
		   p=p.next.next;
		   q=q.next;
		   System.out.println(p.data +"  "+q.data);
	   }
	   System.out.println("Middle Element : "+q.data);
	}
	public static void reverse()
	{
		Node p3,p2,p1;
		p3=head;
        p2=null;	
		while(p3!=null)
		{
			p1=p2;
			p2=p3;
			p3=p3.next;
			p2.next=p1;
		}
		head=p2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InsertAtbegin(10);
        InsertAtbegin(20);
        
        InsertAtbegin(30);
        InsertAtbegin(40);
        InsertAtbegin(60);
        InsertAtbegin(70);
        InsertAtlast(80);
       
        print();
        
        duplicateremove();
        print();
        
        middle();
       
        
               
	}
}
