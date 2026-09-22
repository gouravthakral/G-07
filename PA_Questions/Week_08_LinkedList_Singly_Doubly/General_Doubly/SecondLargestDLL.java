package PA_Questions.Week_08_LinkedList_Singly_Doubly.General_Doubly;

public class SecondLargestDLL {
    public static int findSecondLargest(Node head) {
        if (head == null || head.next == null) {
            throw new IllegalArgumentException("List must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        Node current = head;
        while (current != null) {
            if (current.data > largest) {
                secondLargest = largest;
                largest = current.data;
            } else if (current.data > secondLargest && current.data != largest) {
                secondLargest = current.data;
            }
            current = current.next;
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second distinct largest element found");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head = DoublyLinkedListOperations.insertAtEnd(head, 35);
        head = DoublyLinkedListOperations.insertAtEnd(head, 1);
        head = DoublyLinkedListOperations.insertAtEnd(head, 10);
        head = DoublyLinkedListOperations.insertAtEnd(head, 34);
        head = DoublyLinkedListOperations.insertAtEnd(head, 1);

        System.out.println("Second largest element: " + findSecondLargest(head));
    }
}
