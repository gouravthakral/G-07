package PA_Questions.Week_09_CircularLinkedList.General;

public class CountNodesCLL {
    public static int countNodes(CLLNode head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        CLLNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = CircularLinkedListOperations.insert(head, 1);
        head = CircularLinkedListOperations.insert(head, 2);
        head = CircularLinkedListOperations.insert(head, 3);
        head = CircularLinkedListOperations.insert(head, 4);

        System.out.println("Total nodes in CLL: " + countNodes(head));
    }
}
