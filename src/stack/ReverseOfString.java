package stack;

import java.util.Stack;

public class ReverseOfString {
    public static String reverseTheString(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        for (int i=0;i<str.length();i++){
            chars[i]=(stack.pop());
        }
        return new String(chars);
    }
}
