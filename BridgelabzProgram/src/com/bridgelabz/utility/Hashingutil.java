package com.bridgelabz.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class Hashingutil<T> 
{
	@SuppressWarnings("hiding")
	public class Node<T> {
		T data;
		Node<T> next;

		public Node(T d) {
			data = d;
			next = null;
		}
	}

	@SuppressWarnings("rawtypes")
	Node head;

	/**
	 * @Purpose - Used to pop item present at given position from Data Structure
	 * @param <T> - Generic Variable
	 * @return - Returns item which is present at given position from Data Structure
	 */
	public <T> T pop(int position) {
		T pop_item;

		if (position == 1) {
			pop_item = (T) head.data;
			head = head.next;
		} else {
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			pop_item = (T) temp.next.data;
			temp.next = temp.next.next;
		}
		return pop_item;
	}

	/**
	 * @Purpose - Get an index from data structure where given item is present
	 * @param <T>  - Generic Variable
	 * @param item - Given item whose index is required
	 * @return - returns an index of item
	 */
	public <T> int index(T item) {
		int count = 0;
		if (head == null) {
			System.out.print(" ");
			return count;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				count++;
				if ((temp.data).equals(item)) {
					return count;
				}
				temp = temp.next;
			}
			count++;
			if ((temp.data).equals(item)) {
				return count;
			} else {
				count = 0;
				return count;
			}

		}
	}

	/**
	 * @Purpose - used to search a element in linked list
	 * @param <T>  - Generic variable
	 * @param data - It is a search key
	 */
	public <T> boolean search(T data) {

		if (head == null) {
			System.out.print(" ");
			return false;
		} else {
			int count = 0;
			Node<T> temp = head;
			while (temp.next != null) {
				count++;
				if ((temp.data).equals(data)) {
					System.out.println("Given item is present in LinkedList at position " + count);
					return true;
				}
				temp = temp.next;
			}
			count++;
			if ((temp.data).equals(data)) {
				System.out.println("Given item is present in LinkedList at position " + count);
				return true;
			} else {
				System.out.print(" ");
				return false;
			}

		}
	}

	/**
	 * @Purpose - To know size of data structure
	 * @return - returns size of data structure
	 */
	public int size() {
		int count = 0;
		Node temp = head;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		count++;
		return count;
	}

	/**
	 * @Purpose - Check whether data structure is empty or not
	 * @return - Returns true if data structure is empty else returns false
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * @Purpose - Used to add node in ordered list
	 * @param <T>  - Generic Variable
	 * @param data - A item which user want to insert into ordered list
	 */
	public <T extends Comparable> void add(T item) {
		Node<T> newNode = new Node<T>(item);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				if (temp.data.compareTo(item) == 0 || temp.data.compareTo(item) > 0) {
					newNode.next = head;
					head = newNode;
					return;
				} else {
					if (temp.data.compareTo(item) < 0 && temp.next.data.compareTo(item) >= 0) {
						newNode.next = temp.next;
						temp.next = newNode;
						return;
					}
				}
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

	/**
	 * @Purpose - Used to add node in Unordered list
	 * @param <T>  - Generic Variable
	 * @param data - A item which user want to insert into Unordered list
	 */
	public <T> void addUnordered(T item) {
		Node<T> newNode = new Node<T>(item);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

	public void addToHashTable(Hashingutil<?> table[], int item)

	{
		int pushed_item, poped_item, slot = item % 11;
		if (table[slot] == null)
			table[slot] = new Hashingutil<>();

		if (table[slot].search(item)) {
			pushed_item = 0;
			System.out.println();
			poped_item = (int) table[slot].pop(table[slot].index(item));
			System.out.print(poped_item + " ");
		} else {
			pushed_item = item;
			poped_item = 0;
			table[slot].addUnordered(item);
			System.out.print(pushed_item + " ");
		}
	}

	/**
	 * @Purpose - Used to pop item from Data Structure
	 * @param <T> - Generic Variable
	 * @return - Returns item which is present on top of Data Structure
	 */
	public <T> T pop() {
		T last_item = null;
		if (isEmpty() == false) {
			Node temp = head;
			if (temp.next == null) {
				last_item = (T) head.data;
				head = null;
				return last_item;
			} else {
				if (temp.next.next == null) {
					last_item = (T) head.next.data;
					head.next = null;
					return last_item;
				} else {
					while (temp.next.next != null) {
						temp = temp.next;
					}
					last_item = (T) temp.next.data;
					temp.next = null;
					return last_item;
				}
			}
		} else {
			System.out.println("Data Structure is empty");
			return last_item;
		}
	}

	/**
	 * @Purpose - Used to write file
	 * @path - Path where file is present
	 * @param <T> - Generic Variable
	 * @throws Exception - Used to handle file not found exception
	 */
	public <T> void writeIntoFile(String path) throws Exception {
		FileWriter fileWriter = new FileWriter(path);
		fileWriter.flush();
		BufferedWriter write = new BufferedWriter(fileWriter);
		if (head == null) {
			write.close();
			return;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				write.write((temp.data + " ").toString());
				temp = temp.next;
			}
			write.write((temp.data + " ").toString());
		}
		write.close();
	}

	/**
	 * @Purpose - Used to display the linked list
	 * @param <T> - Generic variable
	 */
	public <T> void display() {
		if (head == null) {
			System.out.println("given LinkedList is empty");
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
			System.out.print(temp.data + "\t");
		}
	}
}
