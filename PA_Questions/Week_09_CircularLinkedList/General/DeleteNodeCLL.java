package PA_Questions.Week_09_CircularLinkedList.General;

public class DeleteNodeCLL {
    public static CLLNode deleteNode(CLLNode head, int key) {
        if (head == null) {
            return null;
        }

        CLLNode current = head;
        CLLNode prev = null;

        while (current.data != key) {
            if (current.next == head) {
                return head;
            }
            prev = current;
            current = current.next;
        }

        if (current == head && current.next == head) {
            return null;
        }

        if (current == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = current.next;
            prev.next = head;
        } else {
            prev.next = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = CircularLinkedListOperations.insert(head, 10);
        head = CircularLinkedListOperations.insert(head, 20);
        head = CircularLinkedListOperations.insert(head, 30);
        head = CircularLinkedListOperations.insert(head, 40);

        head = deleteNode(head, 20);
        CircularLinkedListOperations.printList(head);

        head = deleteNode(head, 10);
        CircularLinkedListOperations.printList(head);
    }
}
