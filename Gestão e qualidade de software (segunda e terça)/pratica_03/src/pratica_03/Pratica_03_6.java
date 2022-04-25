package pratica_03;

import java.util.Scanner;

public class Pratica_03_6 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float celsius;
		do {
			System.out.println("celsius: ");
			celsius = scanner.nextFloat();

			System.out.println("fahrenheit: " + ((celsius * 1.8) + 32));
		} while (celsius != -1);
	}

}
