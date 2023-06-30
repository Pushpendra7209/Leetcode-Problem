import java.util.*;
public class Number_of_distinct_average {
    public int distinctAverages(int[] nums) {
        HashSet<Float> hs = new HashSet<>();
        Arrays.sort(nums);
        int i =0;
        int n = nums.length-1;
        float avg, a =2;
        while(i < n)
        {
            avg = (nums[i] + nums[n])/a;
            hs.add(avg);
            n--;
            i++;
        }
        // System.out.println(hs);
        return hs.size();
    }
}
