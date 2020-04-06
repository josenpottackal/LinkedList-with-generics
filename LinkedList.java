
/**
* File Name: Link.java
* Purpose: An implementation of the LinkedList data structure using generics
* Date: 2020-03-15
* Last modified: 2020-03-15
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

import java.util.NoSuchElementException;
import java.util.*;

public class LinkedList<T> {
		
	private Link<T> head;
	private Link<T> tail;
	
	/**
	 * Constructs an empty LinkedList.
	 */
	public LinkedList () {
		head = null;
		tail = null;
	}
	
	/**
	 * @return Returns true if the LinkedList is empty
	 */
	public boolean isEmpty () {
	    return ((head == null)) || ((tail == null));
	}
	
	/**
	 * @return Returns the element at the head of the LinkedList
	 */
	public T peek() throws NoSuchElementException {
		if (isEmpty()) {
		    throw new NoSuchElementException("LinkedList is empty");
		} else {
			return head.getElement();
		}
	}
	
	/**
	 * Removes the front element of the LinkedList
	 */
	public void dequeue () throws NoSuchElementException {
		if (isEmpty()) {
		    throw new NoSuchElementException("LinkedList is empty");
		} else {
			head = head.getNext();
		}
	}
	
	/**
	 * Puts an element on the back of the LinkedList.
	 */
	public void enqueue (T element) {
		if (isEmpty()) {
			Link<T> newNode = new Link<T>(element, null);
			head = newNode;
			tail = newNode;
		} else {
			Link<T> newNode = new Link<T>(element, null);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public T elementAt (int i) {
		Link<T> curLink = this.head;
		
		for (int j = 0; j < i-1; j++) {
			if (curLink != null) {
				curLink = curLink.getNext();
			} else {
				throw new NoSuchElementException();
			}
		}
		return curLink.getElement();
	}
	
	
	public void insertAt (int i, T e) {
		if (isEmpty ()) {
			if (i == 0) {
				head = new Link<T> (e, null);
			} else {
				throw new NoSuchElementException();
			}
		} else {
			Link<T> curLink = this.head;
			for (int j = 0; j < i-1; j++) {
				if (curLink != null) {
					curLink = curLink.getNext();
				} else {
					throw new NoSuchElementException();
				}
			}
			if (curLink.getNext() == null) {
				curLink.setNext(new Link<T> (e, null));
			} else {
				Link<T> newNode = new Link<T>(e, curLink.getNext());
				curLink.setNext(newNode);
			}
		}
	}
	
	/**
	 * Method to print the full contents of the LinkedList in order from head to tail.
	 */
	public void print () {
		if (!isEmpty()) {
			System.out.println(head.getElement().toString());
			Link<T> LinkedList = head.getNext();
			
			while (LinkedList != null) {
				System.out.println(LinkedList.getElement().toString());
				LinkedList = LinkedList.getNext();
			} 
		} else {
			System.out.println("LinkedList is empty");
		}
	}
}	
