package DSA.Week_08_LinkedList_Singly_Doubly.General_Doubly;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListOperations {
    public static void printForward(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void printBackward(Node tail) {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + (current.prev != null ? " <-> " : ""));
            current = current.prev;
        }
        System.out.println();
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        return newNode;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node newHead = head.next;
        newHead.prev = null;
        return newHead;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBeginning(head, 20);
        head = insertAtBeginning(head, 10);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);

        System.out.print("List forward: ");
        printForward(head);

        head = deleteHead(head);
        head = deleteTail(head);

        System.out.print("After deleting head and tail: ");
        printForward(head);
    }
}
