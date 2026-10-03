package telusko;

public class LinkedList {
    LinkedList list;
    int size;
     Node head;

    public LinkedList() {
        list = new LinkedList();
        size = 0;

    }

    public void add(int val) {
        Node node = new Node(val);
        if(size == 0) {
            this.head = node;
        }else {
            this.head.setNext(node);
            this.head = node;
        }
        size++;
    }

}
