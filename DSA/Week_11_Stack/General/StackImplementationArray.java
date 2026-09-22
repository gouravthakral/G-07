package DSA.Week_11_Stack.General;

/**
 * Stack Implementation using a Fixed-Size Array.
 * Supports standard stack operations: push, pop, peek, isEmpty, isFull, and size.
 */
public class StackImplementationArray {
    private int[] arr;
    private int capacity;
    private int top;

    public StackImplementationArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + value + ", stack is full.");
            return;
        }
        arr[++top] = value;
    }

    // Pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: No elements to pop.");
            return -1;
        }
        return arr[top--];
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty: Cannot peek.");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return the current number of elements
    public int size() {
        return top + 1;
    }

    // Display all elements from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackImplementationArray stack = new StackImplementationArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 30 20 10

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // 20 10

        System.out.println("Is empty: " + stack.isEmpty()); // false
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // Overflow message
        stack.display();
    }
}
