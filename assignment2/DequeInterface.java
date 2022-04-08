package assignment2;

public interface DequeInterface<T>{

	//Add new entry to back of queue:
	void addToBack(T newEntry);
	// Add new entry to front:
	public void addToFront(T newEntry);
	// Removes and returns the entry at front of queue:
	public T removeFront();
	// Removes and returns entry at back:
	public T removeBack();
	// Retrieve entry at front of queue:
	public T getFront();
	// Retrieve the back entry:
	public T getBack();
	// Sees whether deque is empty:
	public boolean isEmpty();
	// Removes all entries:
	public void clear();
	

}
