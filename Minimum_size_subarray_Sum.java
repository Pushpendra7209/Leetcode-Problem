public class Minimum_size_subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {

        int sum=0;
        int res= Integer.MAX_VALUE;
        int l=0;
        for(int r=0; r<nums.length; r++){
            sum += nums[r];
            while(sum>=target){
                res=Math.min(r-l+1,res);
                sum -= nums[l];
                l++;
            }
        }
        if(res<=nums.length){
            return res;
        }
        return 0;
    }
}
