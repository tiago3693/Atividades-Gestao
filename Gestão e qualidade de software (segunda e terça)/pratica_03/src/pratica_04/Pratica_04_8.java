package pratica_04;

import java.util.Scanner;

public class Pratica_04_8 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("peso: ");
		float peso = scanner.nextFloat();
		
		System.out.println("se engordar 15%: " + peso * 1.15);
		System.out.println("se emagrecer 20%: " + peso * 0.8);
	}

}
