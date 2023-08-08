class Solution {
    public int search(int[] arr, int target) {
        int pivot=findPivot(arr);
        if(pivot==-1){
            return b1(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return b1(arr,target,0,pivot-1);
        }
        return b1(arr,target,pivot+1,arr.length-1);
       

    }
    public static int  findPivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static int b1(int arr[],int target, int s, int e){
        while(s<=e){
            System.out.print( s +" "+e);
            int mid=s +  (e-s)/2;
            if(arr[mid]==target){
                return mid;
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
