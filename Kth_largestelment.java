package d;

import java.util.Arrays;

public class Kth_largestelment {
	
	    public int findKthLargest(int[] nums, int k) {
	        Arrays.sort(nums);
	        int kthlargest=1;
	        if(k==1){
	            return nums[nums.length-1];
	        }
	        for(int i=nums.length-2; i>=0; i--){
	           
	                kthlargest++;
	            
	            if(kthlargest==k){
	                return nums[i];
	            }
	        }
	        return 1;
	    }
	
	
}
