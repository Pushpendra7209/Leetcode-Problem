package hashing;

import java.util.HashSet;

public class Intersection_of_two_array {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,2};
		int arr2[]= {2,3,5,6};
		System.out.println(intersection(arr1, arr2));
	}
	public static int intersection(int arr1[], int arr2[]){
		HashSet<Integer> set = new HashSet<>();
		int count =0 ;
		for(int i : arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				count++;
				set.remove(i);
			}
		}
		return count;
	}
}
