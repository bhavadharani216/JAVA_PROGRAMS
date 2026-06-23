package stack;

public class LinkedListStack {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedListStack() {
        top = null;
    }

    // Push
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    public int peek() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        return top.data;
    }

    // Display
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(4);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        stack.push(14);

        System.out.println("Stack Elements:");
        stack.display();

        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Peek Element: " + stack.peek());

        System.out.println("After Pop:");
        stack.display();
    }
}