public class Array11 {

    public static int array11(int[] nums, int index) {
        int count = 0;
        if(index == nums.length-1 && nums[index] == 11) return 1;
        if(nums.length<=0 || index == nums.length-1) return 0;
        if(nums[index] == 11) count = 1;
        count += array11(nums, index+1);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(array11(new int[]{}, 0));
        System.out.println(array11(new int[]{1,2,3,11,11,10,11}, 0));
        System.out.println(array11(new int[]{11,11,11,11,3,4,11}, 0));
    }
}
