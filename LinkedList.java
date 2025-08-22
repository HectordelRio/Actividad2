package Actividad1;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtStart(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public String deleteAtStart() {
        if (head == null) {
            return null;
        }
        String deletedData = head.data;
        head = head.next;
        return deletedData;
    }

    public String getFirst() {
        if (head == null) return null;
        return head.data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
