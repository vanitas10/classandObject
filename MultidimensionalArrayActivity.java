package javaFundamentals;

import java.lang.Math;

public class MultidimensionalArrayActivity {

	public static void main(String[] args) {
			int rows = 2; int columns = 3;
		
			int[][] num1 = {{1,3,5},{7,9,11}};
			int[][] num2 = {{2,4,6},{8,10,12}};
		
			int[][] sum = new int[rows][columns];
		
			for(int x = 0; x<rows; x++) {
				for (int y = 0; y<columns; y++) {
					sum[x][y] = num1[x][y] + num2[x][y];
				}
			}
			System.out.println("The sum of the num1 and num2 is: ");
		
			for (int[] row : sum) {
				for (int column : row) {
				System.out.print(column + "\t");
			}
			System.out.println();
		}

	}
}