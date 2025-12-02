public class Array6 {
    public static boolean array6(int[] nums, int index) {
        if(nums.length == 0) return false;
        if(nums[index] == 6) return true;
        if(index == nums.length-1) return false;
        return array6(nums, index+1);
    }
    public static void main(String[] args) {
        System.out.println(array6(new int[]{0,1,8,9}, 0));
        System.out.println(array6(new int[]{0,6,8,9}, 0));
    }
}
