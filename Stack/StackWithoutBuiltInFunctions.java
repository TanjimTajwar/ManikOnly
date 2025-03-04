package Stack;

class StackWithoutBuiltInFunctions {

    // Node class representing each element in the stack
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor to initialize the stack
    public StackWithoutBuiltInFunctions() {
        top = null;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);   // নতুন নোড তৈরি
        newNode.next = top;              // নতুন নোডের পরবর্তী নোড হবে টপ
        top = newNode;                   // টপকে নতুন নোড হিসেবে সেট করা
    }

    // Method to pop an element from the stack
    public void pop() {
        if (top != null) {
            top = top.next;             // টপ থেকে পরবর্তী নোডে চলে যাওয়া
        } else {
            System.out.println("Stack is empty.");
        }
    }

    // Method to peek the top element of the stack
    public void peek() {
        if (top != null) {
            System.out.println("Top element is: " + top.data);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    // Method to print the stack
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {  // টপ থেকে শুরু করে নোড গুলোর ডেটা প্রিন্ট করা
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        StackWithoutBuiltInFunctions stack = new StackWithoutBuiltInFunctions();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();   // Stack দেখানো হবে

        // Peek the top element
        stack.peek();         // টপ এলিমেন্ট দেখা হবে

        // Pop an element
        stack.pop();          // স্ট্যাক থেকে একটি এলিমেন্ট পপ করা হবে
        stack.printStack();   // স্ট্যাক দেখানো হবে

        // Peek the top element again
        stack.peek();         // টপ এলিমেন্ট আবার দেখা হবে
    }
}
