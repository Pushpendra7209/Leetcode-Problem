import java.util.*;
public class Find_the_difference_of_two_Array {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1  = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();

        for(int a: nums1){
            l1.add(a);
        }
        for(int a: nums2){
            l2.add(a);
        }


        for(int i=0; i<nums1.length; i++){
            if(!l3.contains(nums1[i]) && !l2.contains(nums1[i])){
                l3.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(!l4.contains(nums2[i]) && !l1.contains(nums2[i])){
                l4.add(nums2[i]);
            }
        }
        ans.add(l3);
        ans.add(l4);

        return ans;

    }
}
