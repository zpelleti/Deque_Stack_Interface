package assignment2;

public class Driver {

	public static boolean isPalindrom(String s){

		String aString = "";
		if (s.equals(""))
			return true;
		else {
			//put the whole string into a stack
			StackInterface<String> myStack = new MyStack<String>(s.length()+1);
			for (int i =0; i <s.length(); i++) {
				if (Character.isLetterOrDigit(s.charAt(i))) {
					aString += Character.toString(s.charAt(i)).toLowerCase();
					myStack.push(Character.toString(s.charAt(i)).toLowerCase());
				}
			}

			//pop it out and compare each of the character with the original one
			for (int i = 0; i<aString.length(); i++) {
					if ( !myStack.pop().equals( Character.toString(aString.charAt(i)) ) )
						return false;
			}
			if (myStack.isEmpty())
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isPalindrom("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrom("race car"));
		System.out.println(isPalindrom("abc"));
		System.out.println(isPalindrom("abc!!!$@!#@^cba"));


		MyStack<String> myStack = new MyStack<>(4);
		myStack.push("a");
		myStack.push("b");
		myStack.push("c");
		myStack.push("d");
		System.out.println("##");
		System.out.println(myStack.toString());
		System.out.println("##");

		// stack is full now.
		// 1 and 2 will be ignored
		myStack.push("1");
		myStack.push("2");
		// stack will be cleared
		myStack.clear();
		// stack empty is true
		System.out.println(myStack.isEmpty());


		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		// D pops
		System.out.println(myStack.pop());
		// C pops
		System.out.println(myStack.pop());
		// B pops
		System.out.println(myStack.pop());
		// A pops
		System.out.println(myStack.pop());
		// nothing will pop stack is empy
		System.out.println(myStack.pop());


		// create a deque:
		DequeInterface<String> myDeque = new LinkedDeque<>();

		System.out.println("Deque empty: " + myDeque.isEmpty());

		System.out.println("Add to front and back: Joe, Jess, Jim, Jill, Jane, and Jerry\n " );

		myDeque.addToFront("Jim");
		myDeque.addToFront("Jess");

		myDeque.addToBack("Jerry");
		myDeque.addToBack("Merry");

		myDeque.addToFront("Anna");
		myDeque.addToBack("Elsa");


		System.out.println(myDeque.toString());
		System.out.println(myDeque.getBack());
		System.out.println(myDeque.getFront());
		System.out.println("Adding....");


		System.out.println("Deque empty: " + myDeque.isEmpty());

		System.out.println("\nTesting all methods: ");

		String front;
		String back;
		front = myDeque.getFront();
		System.out.println(front + " is at the front of the queue.");

		back = myDeque.getBack();
		System.out.println(back + " is at the back of the queue.");

		front = myDeque.removeFront();
		System.out.println(front + " is removed from the front.");
		back = myDeque.removeBack();
		System.out.println(back + " is removed from the back.");

		System.out.println("Deque empty: " + myDeque.isEmpty());

		System.out.println("Testing clear....: ");
		myDeque.clear();
		System.out.println("Deque empty: " + myDeque.isEmpty());

		System.out.println("------------------------");

		
		
	}

}
