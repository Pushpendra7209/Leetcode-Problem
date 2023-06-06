import java.util.*;
public class Merge_two_2d_array_by_summing_its_value {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> res = new ArrayList<>();
        int i =0;
        int j =0;
        int m = nums1.length;
        int n = nums2.length;
        while(i<m || j<n ) {
            if (i >= m) {
                res.add(nums2[j++]);
                continue;
            }
            if (j >= n) {
                res.add(nums1[i++]);
                continue;
            }
            if (nums1[i][0] == nums2[j][0]) {
                res.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] > nums2[j][0]) {
                res.add(nums2[j++]);
            } else {
                res.add(nums1[i++]);
            }
        }
        return res.toArray(int[][] :: new);
    }
}
