import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_ll {
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),ans,0);

        return ans;
    }
    public static void backtrack(int nums[] , List<Integer> list, List<List<Integer>> ans , int s)
    {
        if(s == nums.length)
        {
            if(!ans.contains(list)) {
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
        backtrack(nums, list, ans, s+1);
        list.add(nums[s]);
        backtrack(nums,list, ans, s+1);
        list.remove(list.size()-1);

    }

    public static void main(String[] args) {
        int arr[] ={1,2,2};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }
}
