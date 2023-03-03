package d;

import java.util.HashMap;

public class Contiguous_array {
	public int findMaxLength(int[] nums) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			if(nums[i] == 0){
				nums[i] = -1;
			}
		}

		int sum = 0;
		int longestSubsequence = 0;
		for(int i =0; i<nums.length; i++){
			sum += nums[i];
			if(sum == 0){
				longestSubsequence = i+1;
			}
			else if(hm.containsKey(sum)){
				int a = hm.get(sum);
				if(longestSubsequence < i-a)
					longestSubsequence = i-a;
			}
			else{
				hm.put(sum,i);
			}
		}
		return longestSubsequence;
	}
}
