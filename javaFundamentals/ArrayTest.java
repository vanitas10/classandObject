package javaFundamentals;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an Index    : ");
		String index[] = new String[5];
		index[0] = scanner.nextLine();
		
		System.out.print("Enter an Email    : ");
		String email[] = new String[5];
		email[0] = scanner.nextLine();
		
		System.out.print("Enter an Username : ");
		String username[] = new String[5];
		username[0] = scanner.nextLine();
		
		System.out.print("Enter a Password  : ");
		String password[] = new String[5];
		password[0] = scanner.nextLine();
		
		
		
		System.out.println("Index : " + index[0]);
		System.out.println("Email : " + email[0]);
		System.out.println("Username : " + username[0]);
		System.out.println("Password : " + password[0]);
		}
	}