class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=b1(nums, target);
        int b=b2(nums,target);

        return new int[]{a,b};
    }


    //first binary search , it return the first occurence of target

    
    public static int b1(int arr[], int target){
        int s=0, e=arr.length-1;
        while(s<=e){
        int mid=s + (e-s)/2;
        if(arr[mid]==target){
            if(mid==0)
              return mid;
            if(arr[mid-1]<target){
                return mid;
            }
            else{
                e=mid-1;
            }
        }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;

            }
        }
        return -1;
    }


    //second binary Search return last occurence of target
    
    public static int b2(int arr[], int target){
        int s=0, e=arr.length-1;
        while(s<=e){
        int mid=s + (e-s)/2;
        if(arr[mid]==target){
            if(mid==arr.length-1)
            return mid;
            if(arr[mid+1]>target){
                return mid;
            }
            else{
                s=mid+1;
            }
        }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;

            }
        }
        return -1;
    }
}
