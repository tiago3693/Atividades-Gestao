package pratica_04;

import java.util.Iterator;
import java.util.Scanner;

public class Pratica_04_5 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			String matrizS[][] = { { "2*x +2", "x < -2" }, { "3", "-2 <= x < 3" }, { "-x", "3 <= x" } };

			for (String[] i : matrizS) {
				for (String j : i) {
					System.out.print(j + " | ");
				}
				System.out.print(" \n");
			}

			System.out.print("Digite o valor de X: ");
			float num1 = scan.nextFloat();

			matriz(num1);

			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}

	public static void matriz(float x) {
		float matriz[][] = { { 2 * x + 2, x < -2 ? x : 0 }, { 3, -2 <= x && x < 3 ? x : 0 }, { -x, 3 <= x ? x : 0 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.print(" \n");
		}

		/*
		 * for(float[] i : matriz) { for(float j : i) { System.out.print(j + " "); }
		 * System.out.print(" \n"); }
		 */
	}
}
