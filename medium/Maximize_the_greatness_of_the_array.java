import java.util.*;
public class Maximize_the_greatness_of_the_array {
    public int maximizeGreatness(int[] nums) {

        int c = 0;
        Arrays.sort(nums);
        int start = 0 , end =0;
        int n = nums.length;
        while(end < n){
            if(nums[end] > nums[start]){
                c++;
                start++;

            }
            end++;
        }
        return c;
    }
}
