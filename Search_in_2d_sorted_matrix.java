package d;

import java.util.Arrays;

public class Search_in_2d_sorted_matrix {
	public static int[] search(int arr[][] , int target) {
		int r = 0;
		int c = arr.length-1;
		while(r<arr.length && c >= 0) {
			if(arr[r][c] == target) {
				return new int[] {r,c};
			}
			else if(arr[r][c] > target) {
				c--;
			}
			else if(arr[r][c] < target) {
				r++;
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(search(matrix,6)));
	}
}
