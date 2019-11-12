package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;




public class util<T> {
		         
	        	 
	        
				@SuppressWarnings("rawtypes")
				private static  Node top = null;		        	
				@SuppressWarnings("rawtypes")
				private static  Node front = null;
	        	@SuppressWarnings("rawtypes")
				private static  Node rear = null;
	        	@SuppressWarnings("rawtypes")
				private static  Node head = null;
	       
	        	 
	        	static int size = 0;
	        	 
	     	    private static class Node<T> 
	     	    {
	     	         T data;
	     	        private Node<T> next = null;
	     	      
				private Node<T> prev = null;

	     	        Node(T d) 
	     	        {
	     	            data = d;
	     	        }
	     	    }
	     	    
	     	    
	     	    
	     	    
	     	    
	     	    
	   /* -------------------- Stack  Operation ------------------------ */  
	     	    
	     	    
/************************Stack Push*************************************/     	    
	     	    
	     	    
	     	   /**
	     	 * @param <T>         Use generic mean add any time of data
	     	 * @param element     user value add in Stack
	     	 * @return
	     	 */
	     		@SuppressWarnings("unchecked")
	     	public static<T> T push(T element)
	   	    {
	   	    	
	   		     Node<T> newItem = new Node<T>(element);
	   		     newItem.next = top;
	   		     top = newItem;
	   	        return (T) top.data;
	   	    }
	     	   
	     		
/************************Stack Pop*************************************/      	   
	     	   
	     	  /**
	     	 * @param <T>    Use generic mean remove any type of data
	     	 * @return       return remove element
	     	 */
	     	@SuppressWarnings("unchecked")
			public static<T> T pop() {
	     		
	  	        if (top == null) 
	  	        {
	  	            throw new NoSuchElementException("The stack is empty.");
	  	        }

	  	        T output = (T) top.data;
	  	        top = top.next;
              
	  	        
	  	        return output;
	  	    }

/************************Stack Peek*************************************/ 	  	    
	     	  
	  	    /**
	  	     * @param <T>     Use generic  
	  	     * @return        return top stack element
	  	     */
	  	    @SuppressWarnings("unchecked")
			public static<T> T peek() 
	  	    {
	  	        if (top == null) 
	  	        {
	  	        	
	  	            throw new NoSuchElementException("The stack is empty.");
	  	        }
	  	        System.out.println("Top element :"+top.data);
	  	        return (T) top.data;
	  	    }

/************************Stack Empty*************************************/   	    
	  	   
	  	    /**
	  	     * @return   return null;
	  	     */
	  	    public static  boolean isEmpty() 
	  	    {
	  	        return top == null;
	  	    }
	  	    
	  	    
/************************Stack Display*************************************/   	    
	  	    /**
	  	     * @param <T>  use generic
	  	     */
	  	    @SuppressWarnings("unchecked")
			public static<T> T Display() 
	  		{
	  			Node<T> temp = top;
	  			while (temp != null)
	  			{
	  				System.out.print(" "+ temp.data);
	  				temp = temp.next;
	  			}
	  			System.out.println();
				return null;
	  		}
	  	    
	  	    
/************************Stack Size*************************************/   
	  	    
	  	  /**
	  	 * @param <T>   use generic
	  	 * @return 
	  	 * @return      stack size
	  	 */
	  	@SuppressWarnings("unchecked")
		public static<T>  void size() 
			{
		    	int c=0;
		    	
				Node<T> temp = top;
				
				while (temp != null)
				{  c++;
					
					temp = temp.next;
				}
				
				System.out.println("stack Size :"+c);
				
			}
	  	
	  	/************************Stack Size*************************************/  
	  	
	  	/**
	  	 * @param <T>     use generic
	  	 */
	  	@SuppressWarnings("unchecked")
		public static<T> void reverse()
		{
			Node<T> p3,p2,p1;
			p3=top;
	        p2=null;	
			while(p3!=null)
			{
				p1=p2;
				p2=p3;
				p3=p3.next;
				p2.next=p1;
			}
			top=p2;
		}
	  	
	  	
	  
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	/* -------------------- queue  Operation ------------------------ */  	  	
	  	
	  	
		             
/************************ enqueue *************************************/  
	  	
	  	
	  	
	  	/**
	  	 * @param <T>     use generic
	  	 * @param value   add new element in queue
	  	 * @return
	  	 */
	  	@SuppressWarnings("unchecked")
		public  static<T>  T enqueue(T value)
	    {
	    	 if (front==null || rear==null)
		        	
	        {	    		 
	    		Node<T> p=new Node<T> (value);
	            front=rear=p;
	        }
	        else
	        {
	        	 Node<T> p=new  Node<T> (value);
	             rear.next=p;
	             rear=p;
	        }
	    	 return null;
	    }
/************************ dequeue *************************************/  
	  	
	  	/**
	  	 * @param <T>     use generic
	  	 */
	  	@SuppressWarnings("unchecked")
		public static<T> T dequeue()
	    {
	  		T item = null;
	    	 if (front==null || rear==null)
		        	
	        {
	            System.out.println("Queue is Empty");
	            item = null;
	        }
	        else
	        {
	            item= (T) front.data;
	           // System.out.println("Delete is :"+item);
	            
	            front=front.next;
	           
	        }
			return item;
	    }
/************************ queue Size *************************************/  
	  	
	  	 /**
	  	 * @param <T>   use generic
	  	 */
		@SuppressWarnings("unchecked")
	  	public  static<T> void queuesize()
		    {
		    	int c=0;
		    	Node<T> temp=front;
	            while (temp!=null)
	            {
	              c++;
	                temp=temp.next;
	            }
	            System.out.println("Queue size "+c);
		    	
		    }

/************************  display queue *************************************/ 
	  	
	  	/**
	  	 * @param <T>  use generic
	  	 */
		@SuppressWarnings("unchecked")
	  	public  static<T> void queuedisplay()
	    {
	    	 if (front==null || rear==null)
	    	 {
	            System.out.println("Queue is Empty");
	        }
	        else
	        {
	            Node<T> temp=front;
	            while (temp!=null)
	            {
	                System.out.println(temp.data+" ");
	                temp=temp.next;
	            }
	        }
	        
	    }
	  	
	  	
		
		
		
		
		
	  	
/************************ 5. Palimdrome checker *************************************/   	
		
		/**
		 * @param <T>   use generic
		 * @param str   user input string
		 * @param size  user input string  length
		 * @return      return final result in o & 1 
		 */
		public static<T> int palimdromechecker(T str,int size)
		{
			
			for(int i=0;i<size;i++)
			{
				 util.enqueue(((String) str).charAt(i));
			}
			
			  while(size!=0)
			  {
				  --size;
				  if(((String) str).charAt(size)==(char)(util.dequeue()))
				  {
					  continue;
				  }
				  else
				  {
					  
					  return 0;
				  }
				  
			  }
			  return 1;
		}
		
		
		
		
		
		
	  	
/************************9.  prime Anagram *************************************/  
		
		
		
		
		   /**
		 * @param <T>    use generic
		 * @param arr    all prime number  between 0 to 1000 
		 * @return       return all prime anagram number in 2D Array
		 */
		public static<T> String[][] primeanagram2D(int arr[])
		   {
			   String arr1[][]=new String[arr.length][arr.length];
			   for(int i=0;i<arr.length;i++)
		   	    {
		   	    	for(int j=i+1;j<arr.length;j++)
		   	    	{
		   	    		String str1=Integer.toString(arr[i]);
		   	    		String str2=Integer.toString(arr[j]);
		   	    	   
		   	    		char[]c1=str1.toCharArray();
		   	    		char[]c2=str2.toCharArray();
		   	    		Arrays.sort(c1);
		   	    		Arrays.sort(c2);
		   	    		if(Arrays.equals(c1,c2))	    			
		   	    		{
		   	    			
		   	    			arr1[i][j]=str1+" "+str2;
		   	          			
		   	    		
		   	    		}
		   	    	}
		   	    }
			   return arr1;
		   }
			
		
		
		
		
/************************3.  Balanced parentheses *************************************/  	
		
		
	/**
	 * @param <T>          use generic
	 * @param equation     user enter equation
	 * @return             return check balanced or not
	 */
		
	public static <T> boolean isbalancedparentheses(String equation) {

		int len = equation.length();
		char ch;
		for (int i = 0; i < len; i++)
		{
			ch = equation.charAt(i);

			if (ch == '(')
			{
				util.push(ch);
			}

		}
		for (int i = 0; i < len; i++)
		{
			
			ch = equation.charAt(i);
			if (ch == ')')
			{
				if (util.isEmpty() == false)
					util.pop();
				else
					util.push(ch);
			}
		}

		if (util.isEmpty() == true) 
		{

			return true;

		}

		return false;
	}

	
	
	
	
	
		/*----------------- Dequeue Operation  ------------------------------*/ 	
		
		
		static int dequeue_size=0;
	
/************************  Add Front in Dequeue  *************************************/ 
		
		
		
		/**
		 * @param <T>      use generic
		 * @param value    user value
		 * @return         add new value in front
		 */
		@SuppressWarnings("unchecked")
		public static<T> T add_front(T value)
		{
			
			Node<T> newItem = new Node<T>(value);
			if(front==null)
			{
				rear=front=newItem;
			}
			else {
				
				newItem.next=front;
				front.prev=newItem;
				front=newItem;
			}
			dequeue_size++;
			return (T) front;
			
		}

		/************************  Add Rear in Dequeue  *************************************/ 
		
		/**
		 * @param <T>      use generic
		 * @param value    user value
		 * @return         add new value in rear
		 */
		
		@SuppressWarnings("unchecked")
		public static<T> T add_rear(T value)
		{

			Node<T> newItem = new Node<T>(value);
			if(rear==null)
			{
				rear=front=newItem;
			}
			else {
				
				newItem.prev=rear;
				rear.next=newItem;
				rear=newItem;
			}
			dequeue_size++;
			return (T) rear;
			
		}
		
		
/************************  Remove first in Dequeue  *************************************/ 
		
		
		/**
		 * @param <T>      use generic		 
		 * @return         remove  element in first
		 */
		
		@SuppressWarnings("unchecked")
		public static<T> T remove_first()
		{
			
			if(front==null)
			{
				System.out.println("list is empty");
			}
			else
			{
			   Node<T> tmp = front;
			   front = front.next;
			   if (front == null) {
				rear = null;
			}  else {
				front.prev = null;
			}
			   dequeue_size--;
			   return (T) tmp;
			}
			
			return null;
			
			
		}
		
		
		
/************************  Remove Last in Dequeue  *************************************/ 
		
		/**
		 * @param <T>      use generic		 
		 * @return         remove  element in last
		 */
		
		
		@SuppressWarnings("unchecked")
		public static<T> T remove_last()
		{
			if(rear==null)
			{
				System.out.println("Dequeue is Empty");
			}
			else
			{
				Node<T> tmp=rear;
				rear=rear.prev;
				if(rear==null)
				{
					front=null;
				}
				else
				{
					rear.next=null;
				}
				dequeue_size--;
				return (T) tmp;
			}
			
			
			
			return null;		
			
		}
		
/************************   Dequeue size  *************************************/ 	
		
		
		/**
		 * @param <T>   use generic
		 * @return      return dequeue size
		 */
		public static<T> int dequeue_size()
		{
			
			return dequeue_size;
			
		}
		
		
/************************ dequeue_display   *************************************/ 
		
		
		/**
		 * @param <T>    use generic
		 */
		@SuppressWarnings("unchecked")
		public static<T>  void dequeue_display()
		{
			 System.out.println("In display");
			
			if(front ==null)
			{
				System.out.println("Dequeue is Empty");
			}
			Node<T> temp = front;
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
			
			
		}
		
		
		
		
		
		
		
		
/************************ 4. Banking cash counter  *************************************/   		
		

		/**
		 * @param balance      total balance available in  bank
		 * @param amount       user withdraw amount
		 * @return             return remaining amount balance
		 */
		public static long withdraw(long balance, int amount)
		{
			if(balance<=amount)
			{
				System.out.println("Insufficient balance");
			}
			else
			{
				balance=balance-amount;
				System.out.println("Rs."+amount+"is Withdrawed");
				
			}
			return balance;
		}

		/**
		 * @param balance      total balance available in  bank
		 * @param amount       user dispit amount
		 * @return             return Total amount balance
		 */
		public static long diposit(long balance, int amount) 
		{
			balance=balance+amount;
			System.out.println("Rs."+amount+" is Diposit ");
			
			return balance;
			
		}		
		
		
		
/************************7. Binary Search Tree*************************************/ 
		
		/**
		 * @param nodes   User give how many binary search tree show want
		 * @return        final result
		 */
		public static  long countbinarysearchtree(int nodes)

		{
			
			long a= 2*nodes;
			long b=nodes+1;
			a=calculatecatalnumber(a);
			b=calculatecatalnumber(b);
			long c=calculatecatalnumber(nodes);
			
			return a/(b*c);
			
		}

		/**
		 * @param num   user number in Long
		 * @return      Final result
		 */       
		public static long calculatecatalnumber(long num) {
			
			
			long count=num;
			while(count!=1)
			{
				count--;
				num*=count;
			}
			
			return num;
		}

	
		
		
		
		
		
/************************ 12. Show Calandar month  *************************************/ 
				
		/**
		 * @param month     User give month
		 * @param day       user give day
		 * @param year      user give year
		 * @return          retrun all   day month  result in 2d array
		 */
		public static int [][] calandar( int month,int day,int year) {
			

			String[] months= {"", "january","February","march","April","may","june","july","August","September","October","November","December"};
			
			int[] date = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			
			if(month==2 && Utility.CheckLeapyear(year)==1)
			{   
				date[month]=29;
			}
			
			int arr[][] = new int[6][7];
			int x = 1;

			for (int i = 0; i < 6; i++)
			{
				for (int j = day; j < 7; j++)
				{
					if (x <=date[month] )
					{
						arr[i][j] = x;
						x++;

					}
				}
				day = 0;
			}
			System.out.println(  months[month] + "  " + year);
			return arr;
		}

			
/************************ 13. Show Calandar month Using Queue  *************************************/ 		
		
/**
 * @param month   User give which month who want show  all month 
 * @param day     user give starting day
 * @param year    user give year
 */ 
public static void calandarqueue( int month,int day,int year) {
			

			@SuppressWarnings("unused")
			String[] months= {"", "january","February","march","April","may","june","july","August","September","October","November","December"};
			
			int[] date = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			
			if(month==2 && Utility.CheckLeapyear(year)==1)
			{   
				date[month]=29;
			}
			
			int x=1;
			int end_date=date[month];
			for(int i=0;i<42;i++)
			{
				if(i==day && x<=end_date)
				{
					util.enqueue(x);
					day++;
					x++;
				}
				else
				{
					util.enqueue(0);
					
				}
				
			}
			
			
		}

	


	

public static void calandarstack( int month,int day,int year) {
	
		@SuppressWarnings("unused")
		String[] months = { "", "january", "February", "march", "April", "may", "june", "july", "August", "September",
				"October", "November", "December" };

		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		

		int arr[][] = new int[6][7];
		

		if (month == 2 && Utility.CheckLeapyear(year) == 1) 
		{
			date[month] = 29;
		}

		int daymonth = date[month];

		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = day; j < 7; j++) {
				if (count <= daymonth) {
					arr[i][j] = count;

					util.push(arr[i][j]);
					count++;

				} else {
					break;
				}
			}
			day = 0;
		}

		for (int i = 0; i < daymonth; i++) {
			util.push(util.pop());
		}

		util.reverse();
		
		
		util.Display();
	  
	  
	  
	
	

		
	
	
	
}

		
		
		
		
		
	  	
/************************  Unordered Linked list *************************************/ 
	  	
	  	/**
	  	 * @param <T>    use generic
	  	 * @param value  add new value in linked list
	  	 * @return       
	  	 */
	  	@SuppressWarnings("unchecked")
		public static<T> T add(T value)
	  	{
	  		Node<T> newnode =new Node<T>(value);
	  		if(head==null)
	  		{
	  			head=newnode;
	  		}
	  		else
	  		{
	  			Node<T> tmp=head;
	  			while(tmp.next!=null)
	  			{
	  				tmp=tmp.next;
	  			}
	  			tmp.next=newnode;
	  		}
			return null;
	  		
	  	}
	  	/**
	  	 * @param <T>           use generic
	  	 * @return              
	  	 * @throws Exception
	  	 */
	  	@SuppressWarnings("unchecked")
		public  static<T> String UnOrderedListDisplay() throws Exception
	  	{
	  		Node<T> tmp;
			tmp=head;
			String data=" ";
			
			 while(tmp!=null)
			 {
				 data+=tmp.data+" ";
				 System.out.print(" "+tmp.data);
				 tmp=tmp.next;
			 }
			 System.out.println();
			 
			 util.appned(data, data);
			 return data;
	  	}
	  	
	  	
	  	/**
	  	 * @param <T>   use generic
	  	 */
	  	@SuppressWarnings("unused")
		public static<T> void upop()
	  	{
	  		
	  		if (head == null) 
  	        {
  	            throw new NoSuchElementException("The stack is empty.");
  	        }

  	         @SuppressWarnings("unchecked")
			T output = (T) head.data;
  	         head = head.next;
             System.out.println("Top "+head.data);
	  	}
	  	
	  	/**
	  	 * @param <T>       use generic
	  	 * @param search    user give  search word for searching word in file and return it
	  	 * @return          return search word in string
	  	 */
	  	@SuppressWarnings("unchecked")
		public static<T> String search(T search)
		 {
			
			 Node<T> tmp=head;
			 while(tmp.next!=null)
			 {		        
				 if(tmp.data.equals(search))
				 {    
					  
					 return (String) tmp.data;
				 }
				 tmp=tmp.next;
			 }
			 return (String) search;
		 }
	  	
		/**
		 * @param <T>    use generic
		 * @param        search indexing  search word
		 * @return
		 */
		@SuppressWarnings("unchecked")
	  	public static<T> int index(T search)
	  	{
	  		
	  		Node<T> tmp;
			tmp=head;
			
			int c=0;
			 
			 while(tmp!=null)
			 {   c++;
				  if(tmp.data==search)
				  {
					 return c;
				  }
				 tmp=tmp.next;
			 }
			 
	  		return -1;
	  	}
	  	
	  	
		 /**
		 * @param word    count how many node is present in linked list
		 */
		@SuppressWarnings("rawtypes")
		public static void count(String word)
		 {
			int  count=0;
			  Node tmp=head;
			 while(tmp!=null)
			 {  count++;
				 if(tmp.data==word)
				 {
				    delete(word ,count);
				 }
				 tmp=tmp.next;
			 }
			 
			 
		 }
		 /**
		 * @param word        delete node in file 
		 * @param pos         which location want to delete  a node
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void delete(String word,int pos)
		 
		  {
			  Node tmp=head;
			  for(int i=1;i<pos-1;i++)
			  {
				  tmp=tmp.next;
				  
			  }
			  tmp.next=tmp.next.next;
		  }
		 
		 
		/**
		 * @param <T>    use generic
		 * @param value  insert a new node in string
		 * @param pos    which position want to store a new node
		 * @return
		 */
		@SuppressWarnings("unchecked")
	  	public static<T> T insert(T value,int pos)
	  	{
	  		Node<T> newnode =new Node<T>(value);
	  		if(head==null)
	  		{
	  			head=newnode;
	  		}
	  		else
	  		{
	  			Node<T> tmp=head;
	  			for(int i=0;i<pos-2;i++)
	  			{
	  				tmp=tmp.next;
	  			}
	  			newnode.next=tmp.next;
	  			tmp.next=newnode;
	  		}
			return null;
	  		
	  	}
	  	
	  	
		@SuppressWarnings({ "unchecked", "unused" })
		public static<T> void popAtPos(int position) 
		{
			
			Node<T> tmp=head,p;
			if(head==null)
			{
				System.out.println("List is Empty");
			}
			else if(position==0)
			{
				head=head.next;			
			}
			else {
				for(int i=0;i<position-1;i++)
				{
					tmp=tmp.next;
				}
				tmp.next=tmp.next.next;
			}
		
			
		}


		public static void append() {
			
			
		}


		/**
		 * @param <T>  use generic
		 * @return     return size of linked list
		 */
		@SuppressWarnings("unchecked")
		public static<T> int unorderdlistsize() {
			
			int c=0;
	    	
			Node<T> temp = head;
			
			while (temp != null)
			{  c++;
				
				temp = temp.next;
			}
		    c++;
			return c;
			
			
		}


	@SuppressWarnings("unchecked")
	public static <T> T remove() {

		if (head == null) {
			System.out.println("List is Empty");
		} 
		else {
			Node<T> tmp = head;

			while (tmp.next.next != null) 
			{
				tmp = tmp.next;
			}

			return tmp.next.data = null;
		}
		return  null;
		

	}
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	 
/************************ File *************************************/ 	  	   
	
	
	
	/**
	 * @param path         file location where is stored
	 * @return             return  file data in string
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public static String[]  file(String path)throws Exception
	{
		
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		String data;
		String store="";
		while((data=br.readLine())!=null)
		{
			 store=store+data;
		}
		 String[] str=store.split(" ");
		 
		 return str;
	}
	/**
	 * @param newdata      updating new data in file
	 * @param path         file location where is stored
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public  static void appned(String newdata,String path)throws Exception
	{
		
		 PrintWriter writer = new PrintWriter(path);
	       writer.print("");
		
		
		  
		 BufferedWriter out = new BufferedWriter( new FileWriter(path, true)); 
		
        out.write(newdata); 
        out.flush();
	}

	
	/************************ order Linked list *************************************/ 	 
	

	public static void orderadd(int element) {
		
		
	}


	public static String ordersearch(int search) {
		
		return null;
	}


	public static int orderdlistsize() {
		
		return 0;
	}


	public static String orderindex(int element) {
		
		return null;
	}


	public static void orderpop() {
		
		
	}


	public static void orderpopAtPos(int position) {
		
		
	}


	public static void OrderedListDisplay() {
		
		
	}


	

	
	

	
	
	
	
		
	  	
	  
}
