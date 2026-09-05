package james_cutajar.chapt2;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array ) {
        int smallestIndex;
        for(int i = 0; i < array.length; i ++) {
            smallestIndex = i;
            for (int j = i; j < array.length; j ++) {
                if (array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }
            if(smallestIndex != i) {
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = new int[]{13,4,6,43,6,78,4,57,9,9};
        System.out.println(Arrays.toString(selectionSort.sort(array)));
    }
}
