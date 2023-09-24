package javaFundamentals;

import java.util.Scanner;

public class ForEachLoopsCondition {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		String[] hamburgers = {"tomato","Cheese","mustard","ham"};
		
		System.out.print("Ingredient to search: ");
		String search = s.nextLine();
		
		for (String x : hamburgers) {
			if (x.equalsIgnoreCase(search)) {
				System.out.println("I found the " + search);
				break;
			}else {
				System.out.println(x);
			}

		}

	}

}
