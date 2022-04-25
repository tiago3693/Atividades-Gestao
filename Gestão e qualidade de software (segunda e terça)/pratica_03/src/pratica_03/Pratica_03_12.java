package pratica_03;

import java.util.Scanner;

public class Pratica_03_12 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float a,b,c;
		do {
		System.out.println("a: ");
	 a = scanner.nextFloat();

		System.out.println("b: ");
	 b = scanner.nextFloat();

		System.out.println("c: ");
	 c = scanner.nextFloat();

		System.out.println("equacao segundo grau: x1: " + ((-b + Math.sqrt(b*b - 4*a*c))/2*a));
		System.out.println("equacao segundo grau: x2: " + ((-b - Math.sqrt(b*b - 4*a*c))/2*a));
		} while (a != -1 && b != -1 && c != -1);
	}

}
