public class SubArray_product_less_than_k {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Arrays.sort(nums);
        int count =0;
        for(int i =0; i<nums.length; i++){
            int s = nums[i];
            int e = i;
            int p=1;
            while(e<nums.length){
                p=p*nums[e];
                if(p<k){
                    count++;
                }
                else{
                    break;
                }
                e++;
            }
        }
        return count;
    }
}
