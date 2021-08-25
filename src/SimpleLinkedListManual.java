package osu.cse2123;

/**
 * A manual implementation of the SimpledLinkedList class
 *
 * @author ChristianBarrett
 * @version 4.13.2021
 */

public class SimpleLinkedListManual<E> implements SimpleLinkedList<E> {

	private class Node {
		E element;
		Node next;
	}

	private Node front;
	private Node back;
	private int size;

	/**
	 * Creates an empty linked list
	 */
	public SimpleLinkedListManual() {
		this.front = null;
		this.back = null;
		this.size = 0;
	}

	@Override
	public void addFront(E element) { //THIS WORKS
		Node tmp = new Node();
		tmp.next = null;
		tmp.element = element;
		if (this.front == null) { //if  front null
			this.front = tmp; //both front and back should point
			this.back = tmp; //to the same node w/ the element in it
		}
		else { //size of LL bigger than 1
			Node tmp2 = new Node();
			tmp2 = this.front; //new tmp node that holds front
			this.front = tmp; //make the front point to node with new element
			this.front.next = tmp2; //make node after front point to new node
		}
		this.size++;
	}

	@Override
	public E removeFront() { //THIS WORKS
		Node tmp = new Node();
		tmp = this.front; //gathering front node before changing LL

		if (this.size == 1) { //if LL has one node
			this.front = null; //make both front and back null
			this.back = null; //because removing the one node changes both
		}
		else { //if LL is greater than size 1
			this.front = this.front.next; //removing front means changing 
										  //front reference to the next node
		}

		this.size--;
		return tmp.element;
	}

	@Override
	public void addEnd(E element) { //THIS WORKS
		Node tmp = new Node();
		tmp.element = element; //The data portion is the element we want to add to our list
		tmp.next = null; //The reference will be null (it will be added at the end of the list)
		if (this.size == 0) { //If the queue is empty, then front and back will both be null
			this.front = tmp; //Set both front and back to be the new node
			this.back = tmp; //Set both front and back to be the new node
		}
		else {
			this.back.next = tmp; //update last element to point at new node
			this.back = tmp; //update the back reference to point at our new node.
		}
		this.size++;
	}

	@Override
	public E removeEnd() { //THIS WORKS
		Node backE = this.back; //get back node

		if (front.next == null) { //if node after front is null
			this.front = null; //remove the last node (which is the front)
		}
		else {
			Node tmp = new Node();
			tmp = this.front;
			while (tmp.next.next != null) { //iterate through list
											//until the 2nd to last is null
				tmp = tmp.next; //move tmp to the next variable
			}
			tmp.next = null; //make the back variable null
			this.back = tmp;
			
		}

		this.size--;

		return backE.element; //return back element
							  //that existed previous to changing LL
	}

	@Override
	public E front() {
		return this.front.element;
	}

	@Override
	public E end() {
		return this.back.element;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public String toString() { //THIS WORKS
		StringBuilder t = new StringBuilder();
		Node tmp = new Node();
		t.append("<");
		t.append(" ");
		for (tmp = front; tmp != null; tmp = tmp.next) { 
			//iterate until we reach the end
			t.append(tmp.element + " ");
		}
		t.append(">");
		return t.toString();
	}

	public static void main(String args[]) {
		SimpleLinkedList<Integer> test = new SimpleLinkedListManual<>();
		test.addEnd(1);
		test.addEnd(3);
		test.addEnd(4);
		test.addFront(1);
		System.out.println(test.toString());
		int i = test.removeEnd(); //1 1 3
		System.out.println(test.removeEnd()); //1 1
		//System.out.println(test.removeEnd()); //1
		//System.out.println(test.removeEnd()); //nothing
		System.out.println(test.toString());
		System.out.println(i);
		//		int i = test.removeEnd();
		//		System.out.println(i);
		//		test.addFront(2);
		//		i = test.removeFront();
		//		System.out.println(i);
		//		
	}

}
