package DSA.Week_10_LinkedList_LeetCode.LeetCode;

public class LC61_RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        tail.next = head;

        k = k % length;
        int stepsToNewHead = length - k;
        ListNode newTail = tail;

        while (stepsToNewHead > 0) {
            newTail = newTail.next;
            stepsToNewHead--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode rotated = rotateRight(head, 2);
        while (rotated != null) {
            System.out.print(rotated.val + (rotated.next != null ? " -> " : ""));
            rotated = rotated.next;
        }
        System.out.println();
    }
}
