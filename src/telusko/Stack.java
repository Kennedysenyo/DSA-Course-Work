package telusko;

public class Stack {
    private LinkedList list = new LinkedList();

    public void add(int value) {
        list.add(value);
    }

    public int pop() {
        return list.removeLast();
    }

    public int peek() {
       return list.peekLast();
    }

    public String toString() {
        return list.toString();
    }

    public int getSize(){
        return list.getSize();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack);
        stack.add(4);
        stack.add(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.getSize());
    }
}
