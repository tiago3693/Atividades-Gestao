package pratica_04;

import java.util.Scanner;

public class Pratica_04_3 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
		int num1 = -1, num2 = -1, num3 = -1;
	
		while (num1 < 0 || num1 > 10) {
			System.out.println("nota 1 de 0 a 10: ");
			num1 = scan.nextInt();
		}
		while (num2 < 0 || num2 > 10) {
			System.out.println("nota 2 de 0 a 10: ");
			num2 = scan.nextInt();
		}
		while (num3 < 0 || num3 > 10) {
			System.out.println("nota 3 de 0 a 10: ");
			num3 = scan.nextInt();
		}

		mediaCalc(num1, num2, num3);
		System.out.println("sair ?: (S ou N)");
		sair = scan.next();
	} while (!sair.equalsIgnoreCase("S"));
	}

	public static void mediaCalc(int num1, int num2, int num3) {
		float media = (num1 + num2 + num3) / 3;

		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
		} else if (media >= 3 && media < 7) {
			System.out.println("EXAME");
		} else if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
		}
	}
}
