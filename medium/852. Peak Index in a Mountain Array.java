class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
       
        while(s<=e){
             int mid=s+(e-s)/2;
             if(mid-1>=0 && mid+1<=arr.length-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                 return mid;
             else if(mid+1<=arr.length && arr[mid]>arr[mid+1]){
                 e=mid-1;
             }
             else{
                 s=mid+1;
             }
        }
        return -1;
    }
}
