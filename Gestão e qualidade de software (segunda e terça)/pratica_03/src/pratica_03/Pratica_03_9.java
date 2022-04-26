package pratica_03;

import java.util.Scanner;

public class Pratica_03_9 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float cateto1,cateto2;
		do {
		System.out.println("cateto1: ");
		cateto1 = scanner.nextFloat();
		
		System.out.println("cateto2: ");
		cateto2 = scanner.nextFloat();
		
		System.out.println("hipotenusa: " + (Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)))));
		} while (cateto1 != -1 && cateto2 != -1);
	}

}
