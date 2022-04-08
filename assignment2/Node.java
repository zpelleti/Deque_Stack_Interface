package assignment2;

public class Node<T> {

	// deque entry:
	private Object data;
	// link to next Node:
	private Node next;
	// link to previous Node:
	private Node previous;
	

	public Node() {
		data = null;
		next = null;
		previous = null;
	}

	// constructor: 
	 Node(T data) {
		this.data = data;
		this.next = null;
		this.previous = null;
		
	}
	// constructor:
	 Node(Node previousNode, Object data, Node nextNode) {
		this.data = data;
		this.next = nextNode;
		this.previous = previousNode;
	}

	
	Object getData() {
		return data;
	}

	private void setData(Object newData) {
		data = newData;
	}
	
	void setNextNode(Node nextNode) {
		next = nextNode;
	}

	Node getNextNode() {
		return next;
	}

	void setPreviousNode(Node previousNode) {
		previous = previousNode;
	}

	Node getPreviousNode() {
		return previous;
	}

}
