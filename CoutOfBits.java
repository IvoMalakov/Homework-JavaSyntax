package Java_Syntax;

import java.util.Scanner;

public class CoutOfBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		String numberAsBinaryString = Integer.toBinaryString(number);
		int numberAsBinaryStringLength = numberAsBinaryString.length();
		int counterOfBits1 = 0;
		
		for (int i = 0; i < numberAsBinaryStringLength; i++) {
			if (numberAsBinaryString.charAt(i) == '1') {
				counterOfBits1++;
			}
		}
		
		System.out.printf("Your number %d in binary form (%s) contains bit '1' %d times", 
				number, numberAsBinaryString, counterOfBits1);
	}
}