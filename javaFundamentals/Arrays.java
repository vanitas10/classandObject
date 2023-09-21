package javaFundamentals;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		/*Declare w/ values
		 * datatype identifier[]= {val1,val2,val3,val4};
		 * String names[] = {"David","Alenere","Jasfer"};
		 * 
		 * Declare w/o values
		 * datatype identifier[] = new datatype[size];
		 * String name[] = new String [20];*/
		Scanner s = new Scanner(System.in);
		String employeeName[] = new String[4];
		//int evenNumbers[] = new int[10];
		
		System.out.print("Enter Employee Name : ");
		employeeName[0] = s.nextLine();
		System.out.print("Enter Employee Name : ");
		employeeName[1] = s.nextLine();
		System.out.print("Enter Employee Name : ");
		employeeName[2] = s.nextLine();
		
		System.out.print(employeeName[0] + ",");
		System.out.print(employeeName[1] + ",");
		System.out.println(employeeName[2]);
		
	}

}
