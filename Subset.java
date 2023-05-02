import java.util.*;
 class Subset {
        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            backtrack(nums,new ArrayList<>(),ans,0);

            return ans;
        }
        public static void backtrack(int nums[] , List<Integer> list, List<List<Integer>> ans , int s)
        {
            if(s == nums.length)
            {
                List<Integer>temp=new ArrayList<>();
                for(int i:list)
                    temp.add(i);
                ans.add(temp);
                return ;
            }
            backtrack(nums, list, ans, s+1);

            list.add(nums[s]);
            backtrack(nums,list, ans, s+1);
            list.remove(list.size()-1);



    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>>  ans = subsets(arr);
        System.out.println(ans);
    }
}
