package hashing;

import java.util.HashSet;
import java.util.List;

public class Union_of_two_array {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {4,5,6,7,8};
		System.out.println(union(arr1,arr2));
	}
	public static HashSet<Integer> union(int arr1[] , int arr2[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<arr1.length; i++) {
			set.add(arr2[i]);
		}
		return set;
	}
	
	
}
