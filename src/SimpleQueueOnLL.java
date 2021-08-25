package osu.cse2123;

/**
 * An implementation of a Queue on a manual linked list
 *
 * @author ChristianBarrett
 * @version 3.27.2021
 */
public class SimpleQueueOnLL<E> implements SimpleQueue<E> {
	
	public class Node {
		E data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	/**
	 * Creates an empty queue
	 */
	public SimpleQueueOnLL() {
		this.head = null;
		this.tail = null;
		size = 0;
	}

	@Override
	//this is now CORRECT
	public void add(E val) {
		Node tmp = new Node();
		tmp.data = val; //The data portion is the element we want to add to our list
		tmp.next = null; //The reference will be null (it will be added at the end of the list)
		if (this.size == 0) { //If the queue is empty, then front and back will both be null
			this.head = tmp; //Set both front and back to be the new node
			this.tail = tmp; //Set both front and back to be the new node
		}
		else {
			this.tail.next = tmp; //update last element to point at new node
			this.tail = tmp; //update the back reference to point at our new node.
		}
		this.size++;
	}
	
	@Override
	public E front() {
		return this.head.data;
	}

	@Override
	public E remove() {
		Node tmp = new Node();
		tmp = this.head;
		
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		}
		else {
				this.head = this.head.next;
		}
		
		this.size--;
		return tmp.data;
	}

	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuilder to = new StringBuilder();
		to.append("< ");
		Node tmp = this.head;
		while (tmp != null) {
			to.append(tmp.data);
			to.append(" ");
			tmp = tmp.next;
		}
		to.append(">");
		return to.toString();
	}
	
}
