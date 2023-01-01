package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
	public static void main(String[] args) {
		int arr[] = {1,3};
		System.out.println(majorityElement(arr));
	}
	public static List<Integer> majorityElement(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n=arr.length;
		for(int i=0; i< n ; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(int key: map.keySet()) {
			if(map.get(key)>n/3) {
				list.add(key);
			}
		}
		return list;
	
	}
}
