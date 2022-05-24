package pratica_03;

import java.util.Scanner;

public class Pratica_03_10 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float raio;
		do {
		System.out.println("raio: ");
		raio = scanner.nextFloat();
		
		System.out.println("comprimento: " + 2*Math.PI*raio);
		System.out.println("area: " + Math.PI*raio*raio);
		System.out.println("volume: " + ((3f/4f)*Math.PI*Math.pow(raio, 3)));
		} while (raio != -1);
	}

}
