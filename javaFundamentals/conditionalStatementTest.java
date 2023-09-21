package javaFundamentals;

import java.util.Scanner;

public class conditionalStatementTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Grade in English: ");
		float english = s.nextFloat();
		System.out.print("Enter Grade in Math: ");
		float math = s.nextFloat();
		System.out.print("Enter Grade in Science: ");
		float science = s.nextFloat();
		System.out.print("Enter Grade in Computer: ");
		float computer = s.nextFloat();
		float  result;
		float average = (english+math+science+computer)/4;
		float grade = 100;
		System.out.println("Average "+ average);
		if(grade > 100) {
			System.out.println("Invalid Grade ");
		}else if(98 <= average){
			System.out.println("With Highest Honors ");
		}else if(95 <= average) {
			System.out.println("With High Honors ");
		}else if(90 <= average) {
			System.out.println("With Honors ");
		}else if(75 <= average) {
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
		
	}

}