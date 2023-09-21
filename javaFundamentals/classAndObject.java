package javaFundamentals;
import java.util.Scanner;

class Student{
	int id;
	String name;
	float average;
	Scanner s;
	
	public Student(Scanner s1) {
		s = s1;
	}
	public void Stud() {
		System.out.print("Enter Name : ");
		name = s.nextLine();
		
		System.out.print("Enter ID : ");
		id = s.nextInt();
		
		System.out.print("Enter Average : ");
		average = s.nextFloat();
}
	public void display(){
		System.out.println("ID : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Average : " + average);
	}

public class classAndObject {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		Student obj = new Student(s1);
		obj.Stud();
		obj.display();

	}

}
}
