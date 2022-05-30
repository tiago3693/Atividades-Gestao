package pratica_07;

import java.util.Scanner;

public class Pratica_07_5 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, maiorN = 0, menorN = Integer.MAX_VALUE;

		for (int i = 1;; i++) {
			System.out.print("Digite o numero: ");
			num1 = scan.nextInt();
			if (num1 > maiorN) {
				maiorN = num1;
			}
			if (num1 < menorN) {
				menorN = num1;
			}
			System.out.println("maior numero: " + maiorN + "\nmenor numero: " + menorN);
		}
	}
}
