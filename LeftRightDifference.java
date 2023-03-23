import java.util.*;
public class LeftRightDifference {
    public static int[] leftRightDiff(int[] nums) {
        int total =0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        int sum=0;
        int left =0; int right=0;
        for(int i=0; i<nums.length; i++){
            left = sum;
            sum=sum+nums[i];

            right = total-sum;
            nums[i]=Math.abs(right-left);
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] ={10,4,8,3};
        System.out.println(Arrays.toString(leftRightDiff(arr)));
    }
}
