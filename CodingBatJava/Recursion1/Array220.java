public class Array220 {
    public static boolean array220(int[] nums, int index) {
        if(index == 0) index = 1;
        if(nums.length == 0 || nums.length == 1) return false;
        if(index == nums.length-1 && (double)nums[index]/10 == nums[index-1]) return true;
        if(index == nums.length-1 && (double)nums[index]/10 != nums[index-1]) return false;
        if((double)nums[index]/10 == nums[index-1]) return true;
        return array220(nums, index+1);
    }
    public static void main(String[] args) {
        System.out.println(array220(new int[]{0,2,10,50,500},0));
    }
}
