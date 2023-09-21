package javaFundamentals;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lives = 3;
		String answer;
		System.out.println("Who am I?");
		while(lives > 0) {
			
			
			
			System.out.print("Answer : ");
			answer = s.nextLine();
		
		if(answer.equalsIgnoreCase("thirdy"))break;
		else lives--;
		System.out.println();

	}
		if (lives > 0) System.out.println("YOU WON!!!");
			else System.out.println("You LOST");
		}

}

