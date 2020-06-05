package stack.bracketcheck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class BracketChecker {

	/*
	 * 1. get input as a linked list - get input as string - import string into *
	 * linked list 2. initialize empty linked list 3. write method to reverse the
	 * bracket 4. pop element from first list 5. check if second stack is null -
	 * insert popped element if null else - compare head element with popped element
	 * - if it is reverse, pop head element of second stack 6. Invalid if - reverse
	 * is not same as head element of second stack - second stack is not null and
	 * first stack becomes null
	 */

	public static void main(String[] args) {

		HashMap<String, String> reversedBrackets = new HashMap<String, String>();
		reversedBrackets.put("(", ")");
		reversedBrackets.put("[", "]");
		reversedBrackets.put("{", "}");

		Scanner inputs = new Scanner(System.in);
		String endOfInput = inputs.nextLine();
		inputs.close();
		char[] bracketsArray = endOfInput.toCharArray();
		LinkedList<String> bracketSequence = new LinkedList<String>();

		for (char bracket : bracketsArray) {
			bracketSequence.addLast(String.valueOf(bracket));
		}

		LinkedList<String> secondLL = new LinkedList<String>();
		boolean invalidFlag = false;

		while (!bracketSequence.isEmpty()) {
			String headOfList1 = bracketSequence.pop();
			if (secondLL.isEmpty()) {
				secondLL.push(headOfList1);
			} else {
				if (reversedBrackets.containsKey(headOfList1)) {
					secondLL.push(headOfList1);
				} else {
					String secondLLHead = secondLL.pop();
					if (!reversedBrackets.containsKey(secondLLHead)) {
						System.out.println("invalid 1");
						invalidFlag = true;
					}else
					if (reversedBrackets.get(secondLLHead).equals(headOfList1)) {
						continue;
					} else {
						System.out.println("invalid 1");
						invalidFlag = true;
					}
				}

			}

		}

		if (!invalidFlag) {
			if (bracketSequence.isEmpty() && secondLL.isEmpty()) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		}

	}

}
