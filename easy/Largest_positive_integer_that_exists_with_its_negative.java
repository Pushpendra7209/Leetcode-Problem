import java.util.Arrays;

public class Largest_positive_integer_that_exists_with_its_negative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int n  = nums.length -1;
        while ( i < n){
            if(nums[i] >= 0 || nums[n] <= 0){
                return -1;
            }
            int a = Math.abs(nums[i]);
            int b = (nums[n]);
            if(a == b){
                return a;
            }
            else  if(a > b){
                i++;
            }
            else{
                n--;
            }
        }
        return -1;
    }
}
