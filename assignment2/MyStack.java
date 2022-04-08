package assignment2;

import java.util.EmptyStackException;
import java.util.Stack;

@SuppressWarnings("unused")
public class MyStack<T> implements StackInterface {

	// data members
	LinkedDeque<T> stack;
	int stackSize;
	int maxSize;

	//constructor
	public MyStack(int maxSize){
		this.stack = new LinkedDeque<>();
		this.maxSize = maxSize;
		stackSize = 0;
	}

	// adding data to stack
	@Override
	public void push(Object newEntry) {
		if(maxSize > stackSize) {
			stack.addToBack(newEntry);
			stackSize += 1;
		} else{
			System.out.println("stack full");
		}
	}

	//removing data from stack
	@Override
	public Object pop() {
		if(!stack.isEmpty()){
			Object tmp = stack.getBack();
			stack.removeBack();
			stackSize -=1;
			return tmp;
		} else {
			System.out.println("stack empty, nothing to pop");
			return null;
		}
	}

	//check the data on top
	@Override
	public Object peek() {
		if(!stack.isEmpty()) {
			Object top = stack.getBack();
			return top;
		} else {
			System.out.println("stack empty, nothing to peek");
			return null;
		}
	}

	// check if the stack empty
	// alternatively you can check if stacksize = 0
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// clear the stack
	@Override
	public void clear() {
		stackSize = 0;
		stack.clear();
	}

	

	
}
