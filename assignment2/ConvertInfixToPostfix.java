//package assignment2;
//
//
//public abstract class ConvertInfixToPostfix implements StackInterface{
//
//	
//	public static int precedence(Character object) {
//		if(object=='+' || object=='-') {
//			return 1;
//		}
//		else if(object=='*' || object=='/') {
//			return 2;
//		}
//		return 0;
//	}
//	
//	public static String convertToPost(String exp) {
//		MyStack<Character> operators = new MyStack<Character>(0);
//		MyStack<String> postFix = new MyStack<String>(0);
//		
//		for(int i = 0; i < exp.length(); i++) {
//			char ch = exp.charAt(i);
//			
//			if(ch=='(') {
//				operators.push(ch);
//			}
//			else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
//				postFix.push(ch+"");
//			}
//			else if(ch==')') {
//				while(Character.peek() != '(') {
//					char op = (char) operators.pop();
//					// get the two operands:
//					String first = (String) postFix.pop();
//					String second = (String) postFix.pop();
//					// add them in reverse order:
//					String newPostFix = second+first+op;
//					// push result in the stack:
//					postFix.push(newPostFix);
//				}
//				// pop parenthese 1 from stack:
//				operators.pop();
//			}
//			// if current character is an operator:
//			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
//				// check precedence:
////				while(operators.peek() != '(' && precedence(ch) <= precedence(ch) && operators.peek())){
//							char op = (char) operators.pop();
//							
//							String first = (String) postFix.pop();
//							String second = (String) postFix.pop();
//							String newPostFix = second+first+op;
//							
//							postFix.push(newPostFix);
//						}
//				operators.push(ch);
//			}
//		}
//		// if operator stack still has elements, repeat step:
//		while(((Object) operators).size() > 0) {
//			char op = (char) operators.pop();
//			
//			String first = (String) postFix.pop();
//			String second = (String) postFix.pop();
//			String newPostFix = second+first+op;
//			
//			postFix.push(newPostFix);
//		}
//		return (String) postFix.pop();
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		String infix = "A*(B-C)/D+E";
//		System.out.println("With the following infix expression: " 
//							+ infix);
//		String result = convertToPost(infix);
//		System.out.println("The postfix result is: " + result);
//		
//		 infix = "a*(b-c)/d+e";
//		System.out.println("With the following infix expression: " 
//							+ infix);
//		 result = convertToPost(infix);
//		System.out.println("The postfix result is: " + result);
//		
//		
//	}
//
//}
