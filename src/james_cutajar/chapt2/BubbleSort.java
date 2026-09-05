package james_cutajar.chapt2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] unsortedArray) {

        for(int i = 1; i < unsortedArray.length; i++) {
            for(int j = 0; j < unsortedArray.length - 1; j++) {
                if(unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }

        return unsortedArray;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {3,4,5,6,4,6,3,5,3};

        System.out.println(Arrays.toString(bubbleSort.sort(array)));
    }
}
