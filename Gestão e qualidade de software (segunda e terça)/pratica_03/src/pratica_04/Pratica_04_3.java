package pratica_04;

import java.util.Scanner;

public class Pratica_04_3 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cotacao dolar em reais: ");
		float dolarC = scanner.nextFloat();
		System.out.println("valor em dolar: ");
		float dolarV = scanner.nextFloat();

		System.out.println("valor em reais: " + dolarV * dolarC);

	}

}
