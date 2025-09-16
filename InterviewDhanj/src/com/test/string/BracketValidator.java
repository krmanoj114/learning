package com.test.string;

import java.util.Stack;

public class BracketValidator {
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input = "[{()}]";
		if (isBalanced(input)) {
			System.out.println("The string is balanced.");
		} else {
			System.out.println("The string is not balanced.");
		}
	}

}
