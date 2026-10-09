package telusko;

class DNode<T>{
    private T data;
    private DNode<T> prev;
    private DNode<T> next;

    public DNode(T data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public T getData() {
        return data;
    }
   public DNode getNext() {
        return this.next;
   }

   public void setNext(DNode node) {
        this.next = node;
   }

   public DNode getPrev() {
        return this.prev;
   }

   public void setPrev(DNode node) {
        this.prev = node;
   }
}

public class DoublyLinkedList<T> {
    DNode<T> head;
    DNode<T> current;
    int size;

    public DoublyLinkedList() {
        head = null;
        current = null;
        size = 0;
    }

    public void add (T value) {
        DNode node = new DNode(value);
        if(head == null ) {
            head = node;
            current = head;
            size++;
            return;
        }
        current.setNext(node);
        node.setPrev(current);
        current = node;
        size++;
    }

    public void insert(int index, T value) {
        if(index < 0 || index > size -1 ) {
            throw new IndexOutOfBoundsException("Illegal index " + index);
        }
        DNode node = new DNode(value);
        DNode c = head;
        int count = 0;
        while(count< index  ) {
            c = c.getNext();
            count++;
        }

       if(index == 0) {
           node.setNext(c);
           c.setPrev(node);
           this.head = node;
       }else {
           c.getPrev().setNext(node);
           node.setNext(c);
           c.setPrev(node);
       }
        size++;
    }

    @Override
    public String toString(){
        StringBuilder bs = new StringBuilder();
        bs.append("[");
        DNode c = this.head;
        while (c != null) {
            bs.append(c.getData());
            c = c.getNext();
            if(c != null) {
                bs.append(", ");
            }
        }
        bs.append("]");
        return bs.toString();
    }


    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();

        System.out.println(dList);
        dList.add(5);
        dList.add(6);
        System.out.println(dList);

        dList.insert(1,"Insert 1");
        System.out.println(dList);
        dList.insert(0,"Insert 0");
        System.out.println(dList);
        dList.insert(3,"Insert 3");
        System.out.println(dList);
    }

}
