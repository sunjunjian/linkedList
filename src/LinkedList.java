/*
 *	Implementation of LinkedList
 *	Version 1.0.
 *
 *					- Sam Sun <sunjunjian@gmail.com>, 2012
 */


 public class LinkedList {
	private Node head;
	private Node tail;

	/*
	 *   Inner class - Node
	 */
    private class Node {
		private Object data;
    	private Node next;

    	public Node() {
    		next = null;
    		data = null;
    	}
       
    	public Node(Object newData, Node NodeVakue) {
    		data = newData;
    		next = NodeVakue;
    	}
	}     

	// Constructor
	public LinkedList() {
		head = null;
		tail = head;
	}

	// return the length of the list
	public int length() {
		int len = 0;
		Node current = head;
		while(current != null) {
			len++;
			current = current.next;
		}
		return len;
	}


	/*
	 *   public interface method
	 */
	public void pushFront(Object newData) {
		head = new Node(newData,head);
		
		// if this is the only node, tail = head
		if (head.next == null) {
			tail = head;
		}
	}

	public void pushBack(Object newData) {
		Node newNode = new Node(newData, null);
		if(tail != null) {
			tail.next = newNode;
			tail = newNode;
		}
		// if this is the only node, head = tail = newNode
		else {
        	head = newNode;
        	tail = head;
		}
	}    

	public Object popFront() {
		Node result = head;
		
		if (head != tail) {
			// more than one node on the list
			head = head.next;
		}
		else if (tail != null) {
			// only one node on the list
			head = null;
			tail = head;
		}
		
		return	result.data;
	}

	public Object popBack() {
		Node result = tail;
		
		if (head != tail) {
			// more than one node on the list
			// then we need to locate the node before the tail node
			Node previous = head;
			while (previous.next != tail) {
				previous = previous.next;
			}
			
			tail = previous;
			tail.next = null;
		}
		else if (tail != null) {
			// only one node on the list
			head = null;
			tail = head;
		}
		
		return	result.data;
	}	
	
    // return if the target is on the linked list
	public boolean onTheList(Object target) {
		return( find(target) != null);
	}

	// return the node which contains the target
	private Node find(Object target) {
		Node current;
		current = head;
		Object dataAtcurrent;
		while (current != null) {
			dataAtcurrent = current.data;
			if(dataAtcurrent.equals(target))
				return current;
			current = current.next;
		}
		// target not found
		return null;
	}

	public void display() {
		Node current;
		current = head;
		// walk the list until you get to the end
		System.out.println("\n");
		while(current != null)
		{
			System.out.println("data: " + current.data );
			current = current.next;
		}
		System.out.println("\n");
	}	
 }
 