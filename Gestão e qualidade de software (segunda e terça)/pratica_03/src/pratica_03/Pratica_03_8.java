package pratica_03;

import java.util.Scanner;

public class Pratica_03_8 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float peso;
		do {
			System.out.println("peso: ");
			peso = scanner.nextFloat();

			System.out.println("se engordar 15%: " + peso * 1.15);
			System.out.println("se emagrecer 20%: " + peso * 0.8);
		} while (peso != -1);
	}

}
