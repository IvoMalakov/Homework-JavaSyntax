package Java_Syntax;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int aX = scanner.nextInt();
		int aY = scanner.nextInt();
		int bX = scanner.nextInt();
		int bY = scanner.nextInt();
		int cX = scanner.nextInt();
		int cY = scanner.nextInt();
		
		double area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2.0);
		long result = Math.round(area);
		
		if (result == 0) {
			System.out.printf("Those points can not form a triangle! Your result is equal to %d",
					result);
		} else {
			System.out.printf("This triangle has an area = %d", result);
		}
	}
}