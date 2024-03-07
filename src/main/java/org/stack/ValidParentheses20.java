/* Max created on 2/28/2024 inside the package - org.stack */

package org.stack;

import java.util.HashMap;

public class ValidParentheses20 {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid2(String s) {
        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        Stack<Character> bracesStack = new Stack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (charMap.containsKey(currChar)) { // check if it doesn't contain the char means it's a closing brace
                char openingBrace = charMap.get(currChar);
                char topChar = bracesStack.getCurrentSize() != 0 ? bracesStack.pop() : '#';
                if (topChar != openingBrace) {
                    return false;
                }
            } else {
                bracesStack.push(currChar);
            }
        }
        return bracesStack.isEmpty();
    }

    // better solution
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(s.length()); // create an empty stack
        for (char c : s.toCharArray()) { // loop through each character in the string
            if (c == '(' || c == '{' || c == '[') // if the character is an opening parenthesis
                stack.push(c);
            else {
                if (!stack.isEmpty() && (c == '}' && stack.top().equals('{') || c == ']' && stack.top().equals('[') || c == ')' && stack.top().equals('('))) // if the character is a closing bracket
                {
                    stack.pop();
                } else {
                    // if the stack is empty or the top of the stack does not match the closing bracket, the string is not valid, so return false
                    return false;
                }
            }
        }
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }

}
