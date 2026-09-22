package PA_Questions.Week_09_CircularLinkedList.General;

class CLLNode {
    int data;
    CLLNode next;

    CLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListOperations {
    public static CLLNode insert(CLLNode head, int data) {
        CLLNode newNode = new CLLNode(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        CLLNode current = head;
        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = head;
        return head;
    }

    public static void printList(CLLNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        CLLNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    private static void printReverseHelper(CLLNode current, CLLNode head) {
        if (current.next != head) {
            printReverseHelper(current.next, head);
        }
        System.out.print(current.data + " ");
    }

    public static void printReverse(CLLNode head) {
        if (head == null) {
            return;
        }
        printReverseHelper(head, head);
        System.out.println();
    }

    public static CLLNode findMiddle(CLLNode head) {
        if (head == null) {
            return null;
        }

        CLLNode slow = head;
        CLLNode fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);

        System.out.print("CLL forward: ");
        printList(head);

        System.out.print("CLL reverse print: ");
        printReverse(head);

        CLLNode middle = findMiddle(head);
        System.out.println("Middle node: " + (middle != null ? middle.data : "null"));
    }
}
