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
        System.out.println("Size is : " + nums.getSize());

        nums.addFirst(100);
        System.out.println(nums);
        System.out.println("Size is : " + nums.getSize());
        nums.insert(3, 200);
        System.out.println(nums);
        System.out.println("Size is : " + nums.getSize());
        System.out.println(nums.removeFirst());
        System.out.println(nums);
        System.out.println("Size is : " + nums.getSize());
        System.out.println(nums.removeLast());
        System.out.println(nums);
        System.out.println("Size is : " + nums.getSize());
        System.out.println(nums.remove(3));
        System.out.println(nums);
        System.out.println("Size is : " + nums.getSize());


    }
}
