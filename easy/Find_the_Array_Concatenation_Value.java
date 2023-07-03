class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int n = nums.length -1;
        long ans = 0;
        while(i<n){
            int a = nums[i];
            int b = nums[n];
            int z = b;
            int c = 1;
            while(z > 0){
                c *=10;
                z /= 10;
            }
            
            int p = a*c + b;
           // System.out.println(p);
            ans += p;
            i++;
            n--;
        }
        if(nums.length % 2 != 0){
            ans += nums[nums.length/2];
        }
        return ans;
    }
}
