package pratica_03;

import java.util.Scanner;

public class Pratica_03_3 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float dolarC, dolarV;
		do {
		System.out.println("cotacao dolar em reais: ");
		dolarC = scanner.nextFloat();
		System.out.println("valor em dolar: ");
		dolarV = scanner.nextFloat();

		System.out.println("valor em reais: " + dolarV * dolarC);
		} while (dolarC != -1 && dolarV != -1);
	}

}
