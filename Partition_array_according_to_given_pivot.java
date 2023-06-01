import java.util.*;
public class Partition_array_according_to_given_pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        int ans[] = new int [nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] < pivot){
                list1.add(nums[i]);
            }
            else if(nums[i] == pivot){
                list2.add(nums[i]);
            }
            else{
                list3.add(nums[i]);
            }
        }
        //System.out.println(list1+" "+list2+" "+list3);
        int i = 0;
        for(int j = 0; j<list1.size() ; j++)
        {
            ans[i] = list1.get(j);
            i++;
        }
        for(int j = 0; j<list2.size(); j++)
        {
            ans[i] = list2.get(j);
            i++;
        }
        for(int j = 0; j<list3.size(); j++)
        {
            ans[i] = list3.get(j);
            i++;
        }

        return ans;
    }
}
