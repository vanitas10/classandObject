package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		
		//String x;
		int y;
		int x;
		int result;
		
		//y++;
	Scanner s = new Scanner(System.in);
		
		System.out.print("Num 1 : ");
		y = s.nextInt();
		System.out.print("Num 2 : ");
		x = s.nextInt();
		//x = scan.nextDouble();
		//x = scan.nextFloat();
		//x = scan.nextByte();
		result = y+x;
		System.out.print("Result : ");
		System.out.println(y + " + " + x + " = " + result);
		

	}

}
