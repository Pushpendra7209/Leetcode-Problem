class Solution {
    public boolean search(int[] nums, int target) {
        int pivot= pivot(nums, target);
         System.out.println(pivot);
        if(pivot==-1){
            return b1(nums, 0, nums.length-1, target);
        }
        if(nums[pivot]  ==  target){
            return true;
        }
         
        if(b1(nums, 0, pivot, target)){
            return true;
        }
       
        return b1(nums, pivot+1,nums.length-1, target) ;
    }
    public static int pivot(int arr[], int target){
        int a=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(i<arr.length-1 && arr[i]>arr[i+1]){
                return i;
            }
            if(arr[i]>=max){
                max=arr[i];
                a=i;
            }
        }
        return a;
    }
    // public static int pivot(int arr[],int target){
    //     int s=0; 
    //     int e=arr.length-1;
    //     while(s<=e){
    //         int mid = s + (e - s)/2;
    //         if(mid < e && arr[mid] > arr [mid+1]){
    //             return mid;
    //         }
    //         if(s< mid && arr[mid]< arr[mid -1]){
    //             return mid - 1;
    //         }
    //         if(arr[s]>=arr[mid] && target>=arr[s]  && target<=arr[mid]){
    //             e = mid-1;
    //         }
    //         else{
    //             s = mid+1;
    //         }
    //     }
    //     return -1;
    // }
    public static boolean b1(int arr[] , int s , int e, int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }
}
