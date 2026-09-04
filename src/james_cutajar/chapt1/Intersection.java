package james_cutajar.chapt1;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for(int x: a) {
            for(int y: b) {
                if(x == y && !(result.contains(x))) {
                    result.add(x);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 3, 4, 5, 5, 6};
        int[] b = new int[] {2, 4, 5, 6, 7,8};

        Intersection intersection = new Intersection();

        System.out.println(intersection.intersection(a, b));
    }
}
