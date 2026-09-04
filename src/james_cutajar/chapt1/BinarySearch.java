package james_cutajar.chapt1;

public class BinarySearch {
    public boolean binarySearch(int x, int[] sortedNumbers) {
        int start = 0;
        int end = sortedNumbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(sortedNumbers[mid] == x) {
                return true;
            }else if(sortedNumbers[mid] < x) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] a = new int[] {1,2,3,4,5,6,6,7,8};
        System.out.println(binarySearch.binarySearch(1, a));;
    }
}
