package PA_Questions.Week_09_CircularLinkedList.General;

public class JosephusProblem {
    public static int findTheWinner(int n, int k) {
        if (n <= 0 || k <= 0) {
            return -1;
        }

        CLLNode head = new CLLNode(1);
        CLLNode prev = head;
        for (int i = 2; i <= n; i++) {
            CLLNode node = new CLLNode(i);
            prev.next = node;
            prev = node;
        }
        prev.next = head;

        CLLNode current = head;
        while (current.next != current) {
            for (int i = 1; i < k; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            current = prev.next;
        }

        return current.data;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Winner for n=" + n + ", k=" + k + ": " + findTheWinner(n, k));
    }
}
