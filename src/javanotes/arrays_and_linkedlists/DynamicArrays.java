package javanotes.arrays_and_linkedlists;

import java.util.Arrays;

/**
 * Represents a list of int values that can grow and shrink.
 */
public class DynamicArrays {

    private int [] items = new int[8];
    private int itemCt =0;

    /**
     * Return the item at a given index int the array.
     * Throw ArrayIndexOutOfBoundsException if the index is not valid.
     */
    public int get(int index) {
        if(index < 0 || index > itemCt) {
            throw new ArrayIndexOutOfBoundsException("Illegal index" + index);
        }
        return items[index];
    }


    /**
     * Set the value of the element at a given index.
     * Throws ArrayIndexOutOfBoundsException if the index is not valid.
     * @param value
     * @param index
     */
    public void set(int value, int index) {
        if(index < 0 || index > itemCt) {
            throw new ArrayIndexOutOfBoundsException("Illegal index" + index);
        }
        items[index] = value;
    }


    /**
     * Returns the number of items currently in the array.
     * @return
     */
    public int size() {
        return itemCt;
    }

    /**
     * Adds a new item to the end of the array. The size increases by one
     */
    public void add(int value) {
        if(itemCt == items.length) {
            items = Arrays.copyOf(items, 2* items.length);
        }
        items[itemCt] = value;
        itemCt++;
    }

    public int remove(int index) {
        if(index < 0 || index >itemCt) {
            throw new ArrayIndexOutOfBoundsException("Illegal index " + index);
        }
        int value = items[index];

        for(int i = index; i < itemCt; i++) {
            items[i] = items[i +1];
        }
        itemCt--;
        return value;
    }
}
