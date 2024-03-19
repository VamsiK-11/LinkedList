package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class remove {
    public ListNode removeAtBeginning(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or has only one node
        }
        return head.next;
    }

    // Utility method to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Main method to test the solution
    public static void main(String[] args) {
        remove solution = new remove();

        // Creating the original linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);

        head = solution.removeAtBeginning(head);

        System.out.println("\nLinked List after removing element at the beginning:");
        solution.printList(head);
    }
}
