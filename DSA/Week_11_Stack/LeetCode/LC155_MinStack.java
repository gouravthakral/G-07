package DSA.Week_11_Stack.LeetCode;

import java.util.Stack;

/**
 * LeetCode 155: Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Approach:
 * Use a primary stack to hold all elements, and an auxiliary minStack to track
 * the minimum value at each state.
 *
 * Time Complexity: O(1) for push, pop, top, and getMin
 * Space Complexity: O(n) auxiliary space
 */
public class LC155_MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public LC155_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // Push to minStack if empty or value is <= current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        LC155_MinStack minStack = new LC155_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Current min: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top());   // Returns 0
        System.out.println("Current min: " + minStack.getMin()); // Returns -2
    }
}
