package telusko;

public class Node {
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
        next = null;
    }

    public void setVal(int newVal) {
        val = newVal;
    }

    public int getVal() {
        return this.val;
    }
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }
}
