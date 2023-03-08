package d;

public class Sum_of_unique_element {
	 public int sumOfUnique(int[] nums) {
	        Arrays.sort(nums);
	        int sum =0;
	        if(nums.length==1){
	            return nums[0];
	        }
	        for(int i=0; i<nums.length-1; i++){
	            if(i==0 && nums[i]!=nums[i+1]){
	                sum+=nums[i];
	            }
	            else if(i>0 && nums[i]!=nums[i-1] && nums[i] != nums[i+1]){
	                sum+=nums[i];
	            }
	        }
	        if(nums[nums.length-1] != nums[nums.length-2]){
	            sum +=nums[nums.length-1];
	        }
	        return sum;
	    }
}
