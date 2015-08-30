package Java_Syntax;

import java.util.Scanner;

public class DecimalToHexdecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String hex = Integer.toHexString(num);
		System.out.printf("The hexdecimal value of the number %d is %s", num, hex.toUpperCase());
	}
}