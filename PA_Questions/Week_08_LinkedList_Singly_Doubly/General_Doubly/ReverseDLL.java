package PA_Questions.Week_08_LinkedList_Singly_Doubly.General_Doubly;

public class ReverseDLL {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = DoublyLinkedListOperations.insertAtEnd(head, 2);
        head = DoublyLinkedListOperations.insertAtEnd(head, 3);
        head = DoublyLinkedListOperations.insertAtEnd(head, 4);

        System.out.print("Original DLL: ");
        DoublyLinkedListOperations.printForward(head);

        head = reverse(head);
        System.out.print("Reversed DLL: ");
        DoublyLinkedListOperations.printForward(head);
    }
}
