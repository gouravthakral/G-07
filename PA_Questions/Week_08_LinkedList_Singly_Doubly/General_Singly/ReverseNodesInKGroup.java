package PA_Questions.Week_08_LinkedList_Singly_Doubly.General_Singly;

public class ReverseNodesInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count == k) {
            ListNode reversedHead = reverseLinkedList(head, k);
            head.next = reverseKGroup(current, k);
            return reversedHead;
        }

        return head;
    }

    private static ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;

        while (k > 0) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            k--;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverseKGroup(head, 2);
        SinglyLinkedListOperations.printList(result);
    }
}
