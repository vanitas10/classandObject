package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		//boolean isTall = true;
		Scanner s = new Scanner(System.in);
		System.out.print("enter greetings : ");
		String greet = s.nextLine();
		
			
		//if (greet.equals ("hello"))
		if (greet.equalsIgnoreCase ("hello")){
			System.out.println("hi");
		}
		System.out.print("enter age : ");
		int age = s.nextInt();
		boolean isVerified = true;
		boolean isNot = true;
		if(age >= 18) {
			System.out.println("You have access ");
			if (isVerified) {
				System.out.println("Qualified! ");
			}
			
		}else if(age >=13){
			System.out.println("You need parent consent! ");
			if (isNot) {
				System.out.println("Go back when already done!");
			}
			
		}else if(age >= 5) {
			System.out.println("you are a kid ");
		}
		else {
			System.out.println("Access Denied ");
		}
		System.out.println("You have input: " + age);

	}

}
