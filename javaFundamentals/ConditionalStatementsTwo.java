package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatementsTwo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter age: ");
		int age;
		age = s.nextInt();
		//int age = 18;
		boolean isVerified = true;
		boolean hasRuler = true;
		boolean hasBallpen = true;
		if (age >= 18 && isVerified)
			System.out.println("You have access and is qualified");
		else if (age >= 18 && !isVerified)
			System.out.println("You have access but not qualified");
		else
			System .out.println("Access denied");
		if(!hasRuler ==  hasBallpen) System.out.println("You can come in");
		else System.out.println("you can come home");
	}

}
