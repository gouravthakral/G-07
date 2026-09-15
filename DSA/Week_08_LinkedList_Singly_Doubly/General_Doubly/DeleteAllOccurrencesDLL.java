package DSA.Week_08_LinkedList_Singly_Doubly.General_Doubly;

public class DeleteAllOccurrencesDLL {
    public static Node deleteAllOccurrences(Node head, int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = DoublyLinkedListOperations.insertAtEnd(head, 20);
        head = DoublyLinkedListOperations.insertAtEnd(head, 10);
        head = DoublyLinkedListOperations.insertAtEnd(head, 30);
        head = DoublyLinkedListOperations.insertAtEnd(head, 10);

        head = deleteAllOccurrences(head, 10);
        DoublyLinkedListOperations.printForward(head);
    }
}
