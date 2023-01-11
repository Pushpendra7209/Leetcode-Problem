package d;

public class Maximum_distance_between_a_pair_of_value {
	  public int maxDistance(int[] nums1, int[] nums2) {
	       
	       int i=0 , res = 0 , n1 = nums1.length, n2 = nums2.length;
	       for(int j =0 ; j< n2; j++){
	           while(i<n1 && nums1[i] > nums2[j])
	               i++;
	            if( i == n1)
	               break;
	            res = Math.max(res, j-i);
	       }
	       return res;
	    }
}
