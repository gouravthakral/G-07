package PA_Questions.Week_08_LinkedList_Singly_Doubly.General_Singly;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedListOperations {
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static int countNodes(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static boolean search(ListNode head, int target) {
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        printList(head);

        System.out.println("Node count: " + countNodes(head));
        System.out.println("Contains 3: " + search(head, 3));
        System.out.println("Contains 9: " + search(head, 9));

        ListNode middle = findMiddle(head);
        System.out.println("Middle node value: " + (middle != null ? middle.val : "null"));

        ListNode reversed = reverse(head);
        System.out.print("Reversed list: ");
        printList(reversed);
    }
}
