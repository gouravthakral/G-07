package PA_Questions.Week_09_CircularLinkedList.General;

public class InsertBeginningCLL {
    public static CLLNode insertAtBeginning(CLLNode head, int data) {
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
        return newNode;
    }

    public static void main(String[] args) {
        CLLNode head = null;
        head = insertAtBeginning(head, 30);
        head = insertAtBeginning(head, 20);
        head = insertAtBeginning(head, 10);

        CircularLinkedListOperations.printList(head);
    }
}
