package DSA.Week_08_LinkedList_Singly_Doubly.General_Doubly;

public class InsertAfterKeyDLL {
    public static Node insertAfterKey(Node head, int key, int data) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = DoublyLinkedListOperations.insertAtEnd(head, 20);
        head = DoublyLinkedListOperations.insertAtEnd(head, 40);

        head = insertAfterKey(head, 20, 30);
        DoublyLinkedListOperations.printForward(head);
    }
}
