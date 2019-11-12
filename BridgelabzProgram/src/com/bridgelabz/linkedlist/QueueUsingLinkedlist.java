package com.bridgelabz.linkedlist;

public class QueueUsingLinkedlist {
	class node
	{
	    int data;
	    node next;
	    public node(int d)
	    {
	        data=d;
	        next=null;
	    }
	}
	 node front=null,rear=null;
	 
	  
	    public void enqueue(int value)
	    {
	    	 if (front==null || rear==null)
		        	
	        {
	            node p=new node (value);
	            front=rear=p;
	        }
	        else
	        {
	            node p=new node (value);
	            rear.next=p;
	            rear=p;
	        }
	    }
	    public int dequeue()
	    {
	    	 if (front==null || rear==null)
		        	
	        {
	            System.out.println("Queue is Empty");
	            return -1;
	        }
	        else
	        {
	            int x=front.data;
	            front=front.next;
	            return x;
	        }
	    }
	   
	    public void display()
	    {
	    	 if (front==null || rear==null)
	    	 {
	            System.out.println("Queue is Empty");
	        }
	        else
	        {
	            node temp=front;
	            while (temp!=null)
	            {
	                System.out.print(temp.data+" ");
	                temp=temp.next;
	            }
	        }
	        System.out.println();
	    }
	

	public static void main(String[] args) {
		
		
		QueueUsingLinkedlist q=new QueueUsingLinkedlist();
		 q.enqueue(10);
		 q.enqueue(20);
		 q.enqueue(30);
		 q.enqueue(40);
		 q. display();
		 q.dequeue();
		 q. display();
		 q.enqueue(50);
		 q.display();
		 q.dequeue();
		 q. display();
		 
		    
	}

}
