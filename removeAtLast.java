package LinkedList;

public class removeAtLast {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null; // If list is empty or has only one element
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; // Set the next of second-to-last node to null
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        removeAtLast list = new removeAtLast();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display(); // Output: 1 2 3
        list.add(4);
        list.display(); // Output: 1 2 3 4
        list.removeLast();
        list.display(); // Output: 1 2 3
    }
}
