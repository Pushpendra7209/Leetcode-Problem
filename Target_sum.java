package d;

import java.util.Arrays;
import java.util.HashMap;

public class Target_sum {
	public static void main(String[] args) {
		int arr[] = {2,5,7,6};
		int target=9;
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}
	  public static int[] twoSum(int[] numbers, int target) {
	         int res[]=new int[2];
			//HashMap approach
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int i=0;i<numbers.length;i++){
	        	System.out.println(hm.get(numbers[i]));
	          if(hm.containsKey(target-numbers[i])) {
	        	 System.out.println(hm.get(target-numbers[i]));
	              res[0]=hm.get(target-numbers[i])+1;
	              res[1]=i+1;
	              return res;
	          } 
	            else
	                hm.put(numbers[i],i);
	        }
			
	        return res;
	    }
}
