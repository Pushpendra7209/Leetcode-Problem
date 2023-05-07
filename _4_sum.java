import java.util.*;
public class _4_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4){
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int l = j+1;
                int r = n-1;

                while(l<r){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[l];
                    sum+=nums[r];
                    if(sum == target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));


                        l++;
                    }
                    else if(sum>target)
                        r--;

                    else
                        l++;

                }
            }
        }

        return new ArrayList<>(set);
    }
}
