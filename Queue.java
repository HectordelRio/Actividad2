package Actividad1;

public class Queue {
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void enqueue(String data) {
        list.insertAtEnd(data);
    }

    public String dequeue() {
        return list.deleteAtStart();
    }

    public String peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}

