package Java_Syntax;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		System.out.println("Enter the sides of the rectangle");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = a * b;
		
		System.out.printf("The rectangle with sides a = %d and b = %d has an area = %d",
				a, b, result);
	}
}