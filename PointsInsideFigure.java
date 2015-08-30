package Java_Syntax;

import java.util.Scanner;

public class PointsInsideFigure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		boolean isPointInsideTheFigure = checkifPointInsideTheFigure(x, y);
		
		printResult(isPointInsideTheFigure);
	}
	
	public static boolean checkifPointInsideTheFigure(double x, double y) {
		boolean isPointInsideTheFigure = false;
		
		if ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 13.5)) {
			if (y <= 8.5) {
				isPointInsideTheFigure = true;
			} else if (x <= 13.5 || x >= 20.0) {
				isPointInsideTheFigure = true;
			}
		}
		
		return isPointInsideTheFigure;
	}
	
	public static void printResult(boolean isPointInsideTheFigure) {
		if (isPointInsideTheFigure) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}