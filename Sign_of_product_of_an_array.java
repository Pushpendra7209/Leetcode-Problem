public class Sign_of_product_of_an_array {
    public int arraySign(int[] nums) {

        int count0 = 0;
        int countNeg =0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0){
                count0++;
            }
            else if(nums[i] <0 ){
                countNeg++;
            }
        }
        if(count0>0){
            return 0;
        }
        if(countNeg % 2 != 0){
            return -1;
        }
        return 1;
    }
}
