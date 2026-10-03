package telusko;

public class LinkedList {
    private Node head;
    private Node current;
    private int size;


    public LinkedList() {
        head = null;
        current = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if(head == null && current == null) {
            head = node;
            current = node;
            return ;
        }
        current.setNext(node);
        current = node;
        size++;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(head != null) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addLast(int value) {
        add(value);
    }

    public void insert(int index, int value) {
        if(index < 0 || index > size - 1) {
            throw  new IndexOutOfBoundsException("Illegal index" + index);
        }
        Node node = new Node(value);
        Node c = head;
        Node temp = c.getNext();
        for(int i = 0; i < index; i++) {
            c = c.getNext();
            temp = c.getNext();
        }
        c.setNext(node);
        node.setNext(temp);
    }

    public int removeFirst() {
        if(size < 1) {
            throw new IllegalStateException("Singly LinkedList empty");
        }
        Node n = head;
        head = n.getNext();
        n.setNext(null);
        size++;
        return n.getVal();
    }

    public int removeLast() {
        if(head == null) {
            throw new IllegalStateException("Singly LinkedList empty");
        }
        Node node = head;
        while ((node.getNext()).getNext() != null) {
            node = node.getNext();
        }
        Node last = node.getNext();
        node.setNext(null);
        size--;
        return last.getVal();
    }

    public int remove(int index) {
        if(index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Illegal index" + index);
        }
        int count = 0;
        while(count < index){

            count++;

        }
    }

  @Override
    public String toString() {
        if(head == null) {
            return "[]";
        }
        StringBuilder bs = new StringBuilder();
        Node c = head;
        bs.append("[");
        while(true) {
            bs.append(c.getVal());
            c = c.getNext();
            if(c == null) {
                break;
            }
            bs.append(", ");
        }
        bs.append("]");

        return bs.toString();
    }
}
