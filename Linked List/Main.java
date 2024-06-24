import java.util.*;

public class Main {

    public static void displayr(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + "   ");
        displayr(head.next);

    }

    public static void displayrev(Node head) {
        if (head == null)
            return;

        displayr(head.next);
        System.out.print(head.data + "   ");
    }

    public static int count(Node head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static class Node {

        int data; // vale
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(5);
        Node e = new Node(8);

        a.next = b; // a -> b
        b.next = c; // a -> b -> c
        c.next = d; // a -> b -> c -> d
        d.next = e; // a -> b -> c -> d -> e

        displayr(a);
        System.out.println();

        displayrev(a);
        System.out.println();
        System.out.println();
        System.out.println("Number of elements in Linked List: " + count(a));

    }
}