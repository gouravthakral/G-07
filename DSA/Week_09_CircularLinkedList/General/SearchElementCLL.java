package DSA.Week_09_CircularLinkedList.General;

public class SearchElementCLL {
    public static boolean search(CLLNode head, int key) {
        if (head == null) {
            return false;
        }

        CLLNode current = head;
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = CircularLinkedListOperations.insert(head, 10);
        head = CircularLinkedListOperations.insert(head, 20);
        head = CircularLinkedListOperations.insert(head, 30);

        System.out.println("Search 20: " + search(head, 20));
        System.out.println("Search 50: " + search(head, 50));
    }
}
