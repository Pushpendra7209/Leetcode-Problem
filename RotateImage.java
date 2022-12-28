package d;

import java.util.Arrays;

public class RotateImage {
	public static void rotate(int[][] matrix) {
		int m[][] = new int[matrix.length][matrix.length];
		int k=0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=matrix.length-1; j>=0; j--) {
				m[k][matrix.length-j-1]=matrix[j][i];
			}
			k++;
		}
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				matrix[i][j]=m[i][j];
			}
		}
	}


	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("before rotation : ");
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		rotate(matrix);
		System.out.println("after rotation : ");
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
