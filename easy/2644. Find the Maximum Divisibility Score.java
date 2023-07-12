class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=0;
        int ans = 0;
        Arrays.sort(divisors);
        for(int i = 0; i<divisors.length; i++)
        {
            int count = 0;
            for(int j = 0; j<nums.length; j++)
            {
                if( nums[j] % divisors[i] == 0)
                {
                    count++;
                }
            }
           if(max<count){
               max = count;
               ans = divisors[i];
           }
        }
        if(max == 0){
            return divisors[0];
        }
        return ans;
    }
}
