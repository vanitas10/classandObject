package javaFundamentals;

import java.util.Scanner;

public class SwitchStatementTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Month : ");
		int month = s.nextInt();
		//boolean isVerified = true;
		//if (12>=1 && isVerified);
		
		System.out.print("Date  : ");
		int date = s.nextInt();
		//boolean isVerified1 = true;
		//if (31>=1 && isVerified1);
		
		System.out.print("Year  : ");
		int year = s.nextInt();
		//boolean isVerified2 = true;
		//if (2023>=1800 && isVerified2);
		
		String monthWord = "";
		
		switch (month) {
		
		case 1:
			monthWord = "January ";
			break;
		case 2:
			monthWord = "February ";
			break;
		case 3:
			monthWord = "March ";
			break;
		case 4:
			monthWord = "April ";
			break;
		case 5:
			monthWord = "May ";
			break;
		case 6:
			monthWord = "June ";
			break;
		case 7:
			monthWord = "July ";
			break;
		case 8:
			monthWord = "August ";
			break;
		case 9:
			monthWord = "September ";
			break;
		case 10:
			monthWord = "October ";
			break;
		case 11:
			monthWord = "November ";
			break;
		case 12:
			monthWord = "December ";
			break;
			default:
				//System.out.println("Invalid input");
		
		}
		if (monthWord == "") {
			
			System.out.println("Month is Invalid ");
		}else {
			if (date >= 31 || date < 0 )System.out.println("Invalid Date ");
			else System.out.println(); 
				System.out.println(monthWord + "" + date + "," + year);
	}
		}
		
	}
