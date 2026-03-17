package collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        

        Stack<String>stack=new Stack<String>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.push("One"));
        System.out.println(stack.push("Two"));
        System.out.println(stack.push("Three"));
        System.out.println(stack.push("Four"));
        System.out.println(stack.push("Five"));
        System.out.println(stack.push("Six"));

        System.out.println(stack);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.search("Two"));
        System.out.println(stack.search("One"));

        System.out.println(stack.search("Four"));

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());


    }
}