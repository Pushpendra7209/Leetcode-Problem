package d;

import java.util.Arrays;

public class Search_int_2d_sorted_matrix_II {
	public static void main(String[] args) {
		int matrix[][] = {{5,6,10,14},{6,10,13,18},{10,13,18,19}};
		System.out.println(search(matrix,14));
	}
	
	 public static boolean search(int[][] arr, int target) {
	        int row1 = 0, row2 = arr.length-1, col1 = arr[0].length-1, col2=0;
	        while(row1 < arr.length && col1 >= 0 && row2 >=0 && col2 < arr[0].length && row2 >= row1  && col1 >= col2){
	            if(arr[row1][col1] == target || arr[row2][col2] == target)
	                return true;
	            if(arr[row1][col1] > target)
	                col1--;
	            else
	                row1++;
	            if(arr[row2][col2] > target)
	                row2--;
	            else
	                col2++;
	        }
	        return false;
	    
}
}