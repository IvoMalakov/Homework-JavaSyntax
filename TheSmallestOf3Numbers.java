package Java_Syntax;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arrayOFDoubles = new ArrayList<Double>();
		
		for (int i = 0; i < 3; i++) {
			arrayOFDoubles.add(scanner.nextDouble());
		}
		
		double smallestNumber = Collections.min(arrayOFDoubles);
		
		DecimalFormat formatedNumber = new DecimalFormat();
		System.out.println(formatedNumber.format(smallestNumber));
	}
}