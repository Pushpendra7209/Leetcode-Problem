public class Longest_subarray_of_1s_after_deleting_one_element {
    public int longestSubarray(int[] nums) {
        int i =0;
        int j =0;
        int max =0;
        int zeroCount =0;
        while(j < nums.length){
            if(nums[j] == 0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[i] == 0){
                    zeroCount--;
                }
                i++;
            }
            max = Math.max(max,j-i);
            j++;
        }
        return max;
    }
}
