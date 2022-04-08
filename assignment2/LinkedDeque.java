package assignment2;

//import com.sun.org.apache.bcel.internal.generic.ARETURN;

public  class LinkedDeque<T> implements DequeInterface {

	// reference to Node at front of Dequeue:
	private Node firstNode;
	// reference to Node at the back:
	private Node lastNode;
	
	Node<T> head = null;
	Node<T> tail = null;
	
	// default constructor:
	public LinkedDeque() {
		firstNode = null;
		lastNode = null;
	}
	
	
	public void addToFront(Object newEntry) {

		Node newNode = new Node(null, newEntry, firstNode);
		if(isEmpty())
			lastNode = newNode;
		else
		    firstNode.setPreviousNode(newNode);
		firstNode = newNode;
	}
	
	public void addToBack(Object newEntry) {

		Node newNode = new Node(lastNode, newEntry, null);
		
		  if(isEmpty())
			  firstNode = newNode; 
		  else 
			  lastNode.setNextNode(newNode);
		  lastNode = newNode; 
		 
	}

	public Object removeFront() {

		Object front = null;
		
		if(!isEmpty())
			front = firstNode.getData();
			firstNode = firstNode.getNextNode();
			if(firstNode == null)
				lastNode = null;
			else
				firstNode.setPreviousNode(null);
			return front;
	}

	public Object removeBack() {

		Object back = null;
		
		if(!isEmpty())
			back = lastNode.getData();
			lastNode = lastNode.getPreviousNode();
			if(lastNode == null)
				firstNode = null;
			else
				lastNode.setNextNode(null);
			return back;
	}

	
	public Object getFront() {

		Object front = null;
		
		if(!isEmpty()) 
			front = firstNode.getData();
	
		return front;
	}

	
	public Object getBack() {
		
		Object back = null;
		
		if(!isEmpty()) 
			back = lastNode.getData();
			
		return back;
	}

	@Override
	public boolean isEmpty() {

		return firstNode == null && lastNode == null;
	}

	@Override
	public void clear() {

		firstNode = null;
		lastNode = null;
	}

	
}
