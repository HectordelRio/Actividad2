package Actividad1;

public class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(String data) {
        list.insertAtStart(data);
    }

    public String pop() {
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
