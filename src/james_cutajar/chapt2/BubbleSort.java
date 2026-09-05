package james_cutajar.chapt2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] unsortedArray) {
        boolean swapped = true;
        int steps = 0;
        for(int i = 1; i < unsortedArray.length; i++) {
            if(!swapped) break;
            swapped = false;
            for(int j = 0; j < unsortedArray.length - i; j++) {
                steps++;
                if(unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println("In " + steps + " steps");
        return unsortedArray;
    }

    public int[] improvedSort(int[] unsortedArray) {
        int i = 0;
        boolean swapped = true;
        int count = 0;
        while(swapped) {
            swapped = false;
            i++;
            for(int j = 0; j < unsortedArray.length - i; j++) {
                count ++;
                if(unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println("In " + count +  " steps");
        return unsortedArray;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[] {3,4,5,6,4,6,3,5,3};

        System.out.println(Arrays.toString(bubbleSort.sort(array)));
        System.out.println(Arrays.toString(bubbleSort.improvedSort(array)));
    }
}
