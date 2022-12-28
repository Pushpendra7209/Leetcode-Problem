package d;

import java.util.Arrays;

public class First_and_last_occurence_of_target {

	public static int[] searchRange(int[] nums, int target) {
		int a=b1(nums, target);
		int b=b2(nums,target);

		return new int[]{a,b};
	}


	//first binary search , it return the first occurrence of target

	public static int b1(int arr[], int target){
		int s=0, e=arr.length-1;
		while(s<=e){
			int mid=s + (e-s)/2;
			if(arr[mid]==target){
				if(mid==0)
					return mid;
				if(arr[mid-1]<target)
					return mid;
				else
					e=mid-1;
			}
			else if(arr[mid]>target)
				e=mid-1;
			else
				s=mid+1;
		}
		return -1;
	}


	//second binary Search return last occurrence of target

	public static int b2(int arr[], int target){
		int s=0, e=arr.length-1;
		while(s<=e){
			int mid=s + (e-s)/2;
			if(arr[mid]==target){
				if(mid==arr.length-1)
					return mid;
				if(arr[mid+1]>target)
					return mid;
				else
					s=mid+1;
			}
			else if(arr[mid]>target)
				e=mid-1;
			else
				s=mid+1;
		}
		return -1;
	}


	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,6,6,6,6,7,7,8,8,9};
		int target=6;
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}
}

