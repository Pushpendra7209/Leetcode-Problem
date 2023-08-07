class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
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
				return true;
			}
			if(matrix[mid][cmid]<target) {
			
				rstart=mid;
			}
			else {
				rend=mid;
			}
		}
		if(matrix[rstart][cmid]==target) {
			return true;
		}
		if(matrix[rstart+1][cmid]  == target) {
			return  true;
		}
		
		
		if(cmid>0 && target <= matrix[rstart][cmid-1]) {
			return binarySearch(matrix , rstart,0,cmid-1,target);
		}
		if(cmid<col-1 && target>=matrix[rstart][cmid+1] && target<=matrix[rstart][col-1]) {
			return binarySearch(matrix,rstart, cmid+1,col-1,target);
		}
		if(cmid>0 && target<=matrix[rstart+1][cmid-1]) {
			return binarySearch(matrix , rstart+1,0,cmid-1,target);
		}
		else {
		return binarySearch(matrix, rstart+1,cmid+1,col-1,target);
	}
	
	}
	static boolean binarySearch(int [][]matrix,int row, int cstart, int cEnd, int target) {
		while(cstart<=cEnd) {
			int mid = cstart + (cEnd - cstart)/2;
			if(matrix[row][mid]==target) {
				return true;
			}
			else if(matrix[row][mid]>target) {
				cEnd=mid-1;
			}
			else {
				cstart=mid+1;
			}
		}
		return false;
	}
}
