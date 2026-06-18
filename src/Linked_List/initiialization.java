package Linked_List;

class Node {
    int data;
    Node ptr;

    Node(int data) {
        this.data = data;
        ptr = null;
    }
}

public class initiialization {

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.ptr = second;
        second.ptr = third;

        System.out.println("Linked list created");
    }
}