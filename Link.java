
/**
* File Name: Link.java
* Purpose: An implementation of the LinkedList data structure using generics
* Date: 2020-03-15
* Last modified: 2020-03-15
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class Link<E> {
	private E e; //the element contained in this linked list
	private Link<E> next; //the next element of the linked list
	
	public Link (E e, Link<E> n) {
		this.e = e;
		this.next = n;
	}
	
	/**
	 * Method to set the element
	 */
	public void setElement (E e) {
		this.e = e;
	}
	
	/**
	 * Method to set the next linked list element
	 */
	public void setNext (Link<E> e) {
		this.next = e;
	}
	
	/**
	 * Method to get the element.
	 */
	public E getElement () {
		return this.e;
	}
	
	/**
	 * Method to get the next linked list element
	 */
	public Link<E> getNext () {
		return this.next;
	}    	
}
