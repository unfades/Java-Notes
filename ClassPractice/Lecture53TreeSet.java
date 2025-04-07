import java.util.TreeSet;

public class Lecture53TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(15);
        nums.add(7);
        nums.add(12);
        nums.add(18);
        nums.add(20);
        System.out.println("Size of nums: " + nums.size());
        System.out.println(nums);

        TreeSet<String> names = new TreeSet<>();
        names.add("hav");
        names.add("jay");
        names.add("suman");
        names.add("aman");
        names.add("rav");
        names.add("java");
        System.out.println("Size of names: " + names.size());
        //on the basis of Strings, natural order sorted which is lexographical order.
        System.out.println(names);
    }
}
