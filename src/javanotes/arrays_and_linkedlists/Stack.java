package javanotes.arrays_and_linkedlists;

public class Stack {
    private DynamicArray stack;

    public Stack() {
        stack = new DynamicArray();
    }

    public void push(char value) {
        stack.push(value);
    }

    public char pop() {
        try {
            return stack.pop();
        }catch (IllegalStateException exception) {
            stack.push(' ');
            return ' ';
    }}

    public char peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
