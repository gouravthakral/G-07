package PA_Questions.Week_08_LinkedList_Singly_Doubly.General_Singly;

public class RemoveDuplicatesSorted {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode unique = deleteDuplicates(head);
        SinglyLinkedListOperations.printList(unique);
    }
}
