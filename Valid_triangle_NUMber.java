package d;

import java.util.Arrays;

public class Valid_triangle_NUMber {
	 public int triangleNumber(int[] nums) {

		 Arrays.sort(nums);
		 int count = 0;
		 int n=nums.length;
		 for(int i=n-1; i>=2; i--) {
			 int lo=0;
			 int high=i-1;
			 while(lo<high) {
				 if(nums[lo] + nums[high] >nums[i]) {
					 count+= (high-lo);
					 high--;
				 }
				 else {
					 lo++;
				 }
			 }
		 }
	        return count;
	    }
	 public static void main(String[] args) {
		 Valid_triangle_NUMber a = new Valid_triangle_NUMber();
		int arr[] = {2,2,3,4};
		System.out.println(a.triangleNumber(arr));
	}
}
