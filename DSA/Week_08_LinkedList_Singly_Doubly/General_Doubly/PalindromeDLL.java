package DSA.Week_08_LinkedList_Singly_Doubly.General_Doubly;

public class PalindromeDLL {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node left = head;
        Node right = tail;

        while (left != right && left.prev != right) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = DoublyLinkedListOperations.insertAtEnd(head, 2);
        head = DoublyLinkedListOperations.insertAtEnd(head, 3);
        head = DoublyLinkedListOperations.insertAtEnd(head, 2);
        head = DoublyLinkedListOperations.insertAtEnd(head, 1);

        System.out.println("Is DLL palindrome: " + isPalindrome(head));
    }
}
