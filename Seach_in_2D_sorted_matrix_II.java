package d;

import java.util.Arrays;

public class Seach_in_2D_sorted_matrix_II {
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(Arrays.toString(search(matrix,9)));
	}
	static int[] search(int [][]matrix, int target) {
		int row=matrix.length;
		int col=matrix[0].length;
		if(row == 1) {
			return binarySearch(matrix,0,0,col-1,target);
		}
		int rstart=0;
		int rend=row-1;
		int cmid=col/2;
		
		while(rstart<(rend-1)) {
			int mid = rstart+(rend-rstart)/2;
			if(matrix[mid][cmid]==target) {
				return new int[] {mid,cmid};
			}
			if(matrix[mid][cmid]<target) {
			
				rstart=mid;
			}
			else {
				rend=mid;
			}
		}
		if(matrix[rstart][cmid]==target) {
			return new int[] {rstart,cmid};
		}
		if(matrix[rstart+1][cmid]  == target) {
			return new int[] {rstart+1,cmid};
		}
		
		
		if(target <= matrix[rstart][cmid-1]) {
			return binarySearch(matrix , rstart,0,cmid-1,target);
		}
		if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][col-1]) {
			return binarySearch(matrix,rstart, cmid+1,col-1,target);
		}
		if(target<=matrix[rstart+1][cmid-1]) {
			return binarySearch(matrix , rstart+1,0,cmid-1,target);
		}
		else {
		return binarySearch(matrix, rstart+1,cmid+1,col-1,target);
	}
	
	}
	static int[] binarySearch(int [][]matrix,int row, int cstart, int cEnd, int target) {
		while(cstart<=cEnd) {
			int mid = cstart + (cEnd - cstart)/2;
			if(matrix[row][mid]==target) {
				return new int[] {row,mid};
			}
			else if(matrix[row][mid]>target) {
				cEnd=mid-1;
			}
			else {
				cstart=mid+1;
			}
		}
		return new int[] {-1, -1};
	}
}
