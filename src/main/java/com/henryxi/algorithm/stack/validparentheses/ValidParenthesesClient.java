package com.henryxi.algorithm.stack.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesClient {
    public static void main(String[] args) {
        String s = "[({(())}[()])]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (map.keySet().contains(currChar)) {
                char topChar = stack.isEmpty() ? '#' : stack.pop();
                if (!map.get(currChar).equals(topChar)) {
                    return false;
                }
            } else {
                stack.push(currChar);
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOtherValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
