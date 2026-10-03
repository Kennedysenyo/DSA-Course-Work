package telusko;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void setVal(int newData) {
        data = newData;
    }

    public int getVal() {
        return this.data;
    }
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }
}
