import java.util.*;
public class Continues_subArray_sum {
    public static boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int r = sum % k ;
            if(!map.containsKey(r)){
                map.put(r,i);
            }
            else if(i - map.get(r) > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,5,7};
        int k =6;
        System.out.println(checkSubarraySum(arr, k));
    }
}
