import java.util.Arrays;
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] difference = new int[nums.length+1];
        Arrays.fill(difference, 0);
        //System.out.println(Arrays.toString(difference));
        for(int i = 0; i<queries.length; i++){
            int[] j = queries[i];
            difference[j[0]] -=1;
            difference[j[1]+1] +=1;
        }
        //System.out.println(Arrays.toString(difference));
        int prefix = 0;
        for(int i = 0; i<difference.length-1;  i++){
            nums[i] += prefix+=difference[i];
        }
        //System.out.println(Arrays.toString(nums));
        for(int i : nums){
            if(i>0) return false;
        }
        return true;
    }
}
