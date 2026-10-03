package javanotes.arrays_and_linkedlists;

import java.util.Arrays;

public class DynamicArray {

    private char[] data;
    private int capacity;
    private int size;
    public DynamicArray() {
        capacity = 2;
        data = new char[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public char get(int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Illegal index " + index);
        }
        return data[index];
    }
    private void resize() {

        data = Arrays.copyOf(data, 2 * capacity);
        capacity*=2;
    }

    public void push(char value) {
        if(size == capacity || size == data.length) {
            resize();
        }
        data[size] = value;
        size++;
    }

    public char pop() {
        if(size == 0) {
            throw new IllegalStateException("Arrays is empty  ");
        }
        char poppedItem = data[size - 1];
        data = Arrays.copyOf(data, size());
        size--;
        return poppedItem;

    }

    public char[] insert(int index, char value) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Illegal index " + index);
        }
        char temp1 = data[index];
        char temp2 = data[index + 1];

        for (int i = index; i <= size; i++) {
            if(i == index) {
                data[i] = value;
            }else {

                data[i] = temp1;
                temp1 = temp2;
                if(i + 1 == data.length) {
                    resize();
                }
                temp2 = data[i + 1];
            }
        }
        size++;
        return data;
    }

    public char remove(int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Illegal index " + index);
        }
        char removedItem = data[index];
        for(int i = index; i < size; i ++) {
            data[i] = data[i+1];
        }
        size--;
        return removedItem;
    }

    @Override
    public String toString(){
        StringBuilder bs = new StringBuilder();
        bs.append("[");
        for(int i =0; i < size(); i++){
            bs.append(data[i] );
            bs.append( i== size() - 1 ? "": ", ");
        }
        bs.append("]");
        return bs.toString();
    }

    public static void main(String[] args) {
        DynamicArray dArray = new DynamicArray();
        dArray.push('d');
        dArray.push('d');
        dArray.push('d');
        dArray.push('d');
        System.out.println(dArray);
        dArray.insert(2, 't');
        dArray.insert(1, 'o');
        System.out.println(dArray.toString());
        dArray.remove(0);
        System.out.println(dArray.toString());
    }
}
