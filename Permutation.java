import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        List<List<Integer>> res = permutation(arr);
        System.out.println(res);
    }
    public static List<List<Integer>> permutation(int[] nums){
       List<List<Integer>>  result = new ArrayList<>();
       backtrack(result, nums, 0);
       return result;
    }
    public static List<List<Integer>> backtrack(List<List<Integer>> list, int nums[], int s)
    {
        if(s == nums.length){
            list.add(tolist(nums));
        }
        else{
            for(int i=s; i<nums.length; i++){
                swap(i,s, nums);
                backtrack(list, nums, s+1);
                swap(i, s, nums);
            }
        }
        return list;
    }
    public static void swap(int i, int j , int nums[])
    {
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

       
    }
    public static List<Integer> tolist(int nums[])
    {
        List<Integer > list = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        return list;
    }


}
