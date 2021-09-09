package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework4_11_main {
	public static void main(String[] args) {
		int[][] A = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int[][] B = {{5,4,3,2,1},{5,4,3,2,1},{5,4,3,2,1},{5,4,3,2,1},{5,4,3,2,1}};
		int[][] AB = new int[5][5];
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				for(int k=0; k<5;k++) {
					AB[i][j] = AB[i][j] + (A[i][k]*B[k][j]);
				}
			}
		}
		
		System.out.println(Arrays.deepToString(AB));

	}
}
