package pratica_04;

import java.util.Scanner;

public class Pratica_04_6 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("celsius: ");
		float celsius = scanner.nextFloat();
		
		System.out.println("fahrenheit: " + ((celsius * 1.8)+32));
	}

}
