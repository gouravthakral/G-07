package DSA.Week_09_CircularLinkedList.General;

public class MaxElementCLL {
    public static int findMax(CLLNode head) {
        if (head == null) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = head.data;
        CLLNode current = head.next;

        while (current != head) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = CircularLinkedListOperations.insert(head, 15);
        head = CircularLinkedListOperations.insert(head, 72);
        head = CircularLinkedListOperations.insert(head, 30);
        head = CircularLinkedListOperations.insert(head, 45);

        System.out.println("Maximum element: " + findMax(head));
    }
}
