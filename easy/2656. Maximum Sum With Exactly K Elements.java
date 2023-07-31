class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int c = 0;
        int n = nums.length - 1;
        
        while( n >= 0){
            sum += nums[n];
            nums[n] = nums[n]+1;
            k--;
            if(k == 0){
                break;
            }
        }
        return sum;
    }
}
