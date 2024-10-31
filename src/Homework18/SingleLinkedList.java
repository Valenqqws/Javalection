package Homework18;

import org.w3c.dom.Node;

public class SingleLinkedList {


    private Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;

    }

    public void add(String value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = node;
        }

        size++;
    }

    public void remove () {

        if (head == null) {
            System.out.println("Empty list");;
        } else {
            Node current = head;
            while (current.next.next == null) {
                current.next = null;
            }
            System.out.println(null + "Delete");
        }

    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node current = head;
        while (current.next != null) {
            if (current.next == null) {
                System.out.println(current.data);
            } else {
                System.out.println(current.data + "--->");
            }
            current = current.next;

        }
        System.out.println("Null");
    }

    class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = next;
        }
    }




        }
















