package com.ctci.stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author rampatra
 * @since 2019-02-08
 */
public class SortStack {

    private static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.empty()) {
            tempStack.push(stack.pop());
        }
        while (!tempStack.empty()) {
            Integer item = tempStack.pop();
            if (stack.empty()) {
                stack.push(item);
            } else {
                while (!stack.empty() && item > stack.peek()) {
                    tempStack.push(stack.pop());
                }
                stack.push(item);
            }
        }
    }

    private static void printStack(Stack<Integer> stack) {
        System.out.println(Arrays.toString(stack.toArray()));
    }

    public static void main(String[] args) {
        Stack<Integer> unsortedStack = new Stack<>();
        unsortedStack.push(2);
        unsortedStack.push(5);
        unsortedStack.push(1);
        unsortedStack.push(3);
        printStack(unsortedStack);
        sortStack(unsortedStack);
        printStack(unsortedStack);
    }
}
