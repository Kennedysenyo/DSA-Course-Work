package telusko;



public class Main {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        System.out.println(nums);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);

        nums.addFirst(100);
        System.out.println(nums);
        nums.insert(3, 200);
        System.out.println(nums);
        System.out.println(nums.removeFirst());
        System.out.println(nums);
        System.out.println(nums.removeLast());
        System.out.println(nums);

    }
}
