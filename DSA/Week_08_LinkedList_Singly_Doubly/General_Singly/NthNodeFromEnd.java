package DSA.Week_08_LinkedList_Singly_Doubly.General_Singly;

public class NthNodeFromEnd {
    public static ListNode findNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        ListNode result = findNthFromEnd(head, 2);
        System.out.println("2nd node from end: " + (result != null ? result.val : "null"));
    }
}
