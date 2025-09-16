package com.test.string;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String input1 = "((()))";
		String input2 = "({[]})";
		String input3 = "())(";
		
		System.out.println(input1 + " is valid: " + isValidParentheses(input1));
        System.out.println(input2 + " is valid: " + isValidParentheses(input2));
        System.out.println(input3 + " is valid: " + isValidParentheses(input3));
   
	}

	public static boolean isValidParentheses(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: str.toCharArray()) {
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}  else if(ch==')' || ch=='}' || ch==']') {
				if(stack.empty()) {
					return false;
				}
				
				char top = stack.pop();
				if ((ch == ')' && top != '(') ||
	                    (ch == ']' && top != '[') ||
	                    (ch == '}' && top != '{')) {
	                    return false; 
			}
		}
		
		}
		return stack.empty();

     }
}
