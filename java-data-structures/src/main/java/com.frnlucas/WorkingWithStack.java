package com.frnlucas;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

    }
}
