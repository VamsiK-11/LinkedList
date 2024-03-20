package LinkedList;

public class addAtLast {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addAtLast list = new addAtLast();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display(); // Output: 1 2 3
        list.add(4);
        list.display(); // Output: 1 2 3 4
    }
}
