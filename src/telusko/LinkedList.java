package telusko;

public class LinkedList {
    private Node head;
    private Node current;
    private int size;


    public LinkedList() {
        head = null;
        current = null;
        size = 0;
    }

    public void add(int value) {
        Node node = new Node(value);
        if(head == null && current == null) {
            head = node;
            current = node;
            size++;
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
        size++;
    }

    public int removeFirst() {
        if(size < 1) {
            throw new IllegalStateException("Singly LinkedList empty");
        }
        Node n = head;
        head = n.getNext();
        n.setNext(null);
        size--;
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
        if(index < 0 || index > size ) {
            throw new IndexOutOfBoundsException("Illegal index" + index);
        }
        int count = 0;
        Node c = head;
        while(count < index - 1){
            c = c.getNext();
            count++;
        }
        Node node = c.getNext();
        if((c.getNext().getNext()) != null) {
            c.setNext(c.getNext().getNext());
        }else {
            c.setNext(null);
        }
        node.setNext(null);
        size--;
        return node.getVal();
    }

    public int peekLast () {
        return current.getVal();
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index " + index);
        }
        Node c = head;
        for(int i =0; i <= index; i++){
            c = c.getNext();
        }
        return c.getVal();
    }

    public int getSize() {
        return size;
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
