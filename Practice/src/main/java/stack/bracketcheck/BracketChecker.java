package stack.bracketcheck;

import java.util.HashMap;
import java.util.LinkedList;

public class BracketChecker {
	static HashMap<String, String> reversedBrackets = new HashMap<String, String>();


	/*
	 * 1. get input as a linked list - get input as string - import string into *
	 * linked list 2. initialize empty linked list 3. write method to reverse the
	 * bracket 4. pop element from first list 5. check if second stack is null -
	 * insert popped element if null else - compare head element with popped element
	 * - if it is reverse, pop head element of second stack 6. Invalid if - reverse
	 * is not same as head element of second stack - second stack is not null and
	 * first stack becomes null
	 */
	public static void validateBracketSequence(String sequence) {
		char[] bracketsArray = sequence.toCharArray();
		LinkedList<String> bracketSequence = new LinkedList<String>();

		for (char bracket : bracketsArray) {
			bracketSequence.addLast(String.valueOf(bracket));
		}

		LinkedList<String> secondLL = new LinkedList<String>();
		boolean invalidFlag = false;

		while (!bracketSequence.isEmpty()) {
			String headOfList1 = bracketSequence.pop();
			
			// push only opening brackets into second LL
			if (secondLL.isEmpty() || reversedBrackets.containsKey(headOfList1)) {
				secondLL.push(headOfList1);
			} else {
				// compare if the closing brackets in stack 1 matches opening in stack 2
				String secondLLHead = secondLL.pop();
				if (!headOfList1.equals(reversedBrackets.get(secondLLHead))) {
					invalidFlag = true;
					break;
				}
			}
		}

		if (secondLL.isEmpty() && !invalidFlag) {
			System.out.println(sequence + " is valid");
		} else {
			System.out.println(sequence + " is invalid");
		}
	}
	
	public static void main(String[] args) {
		reversedBrackets.put("(", ")");
		reversedBrackets.put("[", "]");
		reversedBrackets.put("{", "}");


		validateBracketSequence("[{}]");	
		validateBracketSequence("[[]");
		validateBracketSequence("[][]");
		validateBracketSequence("[]]");
		validateBracketSequence("[][[");
		validateBracketSequence("[{}][]");
	}

}
