package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class beginning {
    public ListNode addAtBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode;
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
        beginning solution = new beginning();

        // Creating the original linked list: 2 -> 4 -> 6 -> 8
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);

        System.out.println("Original Linked List:");
        solution.printList(head);

        int elementToAdd = 1;
        head = solution.addAtBeginning(head, elementToAdd);

        System.out.println("\nLinked List after adding " + elementToAdd + " at the beginning:");
        solution.printList(head);
    }
}
