package javaFundamentals;

import java.util.Scanner;

public class ForEachLoopsTest {
	public static void main (String [] args) {
		int num[] = {1,2,3,4};
		int sum = 0;
	
		for (int numbers : num) {
			sum = sum + numbers;
		}
		System.out.print("Sum : " + sum);
	}
}