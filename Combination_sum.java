import java.util.*;
public class Combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, 0, target, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    public static void backtrack(int nums[], int sum, int target, int i, ArrayList<Integer> list, List<List<Integer>> ans){
        if(i == nums.length){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if(sum > target){
            return ;
        }
        list.add(nums[i]);
        backtrack(nums,sum+nums[i],target,i,list, ans);
        list.remove(list.size()-1);
        backtrack(nums,sum , target,i+1, list , ans);
    }
}
