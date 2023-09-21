package javaFundamentals;

public class switchAndIfElse {

	public static void main(String[] args) {
		
		/*Enter letter : O
		Output : vowel*/
		
		String vowel = "O";
		int alpha = 1; // 1 is the case of the switch O
		System.out.print("Enter letter : ");
		switch(alpha) {
		case 1:
			System.out.println(vowel);
			break;
		}System.out.print("Output : ");
		if (alpha > 0) {
			System.out.println("Vowel");
		}else {
			System.out.println("Error");
		}

	}

}
