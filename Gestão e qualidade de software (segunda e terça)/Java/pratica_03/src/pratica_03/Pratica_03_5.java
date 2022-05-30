package pratica_03;

import java.util.Scanner;

public class Pratica_03_5 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float diagonalMa, diagonalMe;
		do {
		System.out.println("diagonal maior: ");
		diagonalMa = scanner.nextFloat();
		
		System.out.println("diagonal menor: ");
		diagonalMe = scanner.nextFloat();
		
		System.out.println("area losango: " + ((diagonalMa * diagonalMe)/2));
		} while (diagonalMa != -1 && diagonalMe != -1);
		}

}
