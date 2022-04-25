package pratica_04;

import java.util.Scanner;

public class Pratica_04_6 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			System.out.print("Digite o valor de X: ");
			float num1 = scan.nextFloat();

			System.out.print("Digite o valor de Y: ");
			float num2 = scan.nextFloat();

			System.out.print("Digite o valor de Z: ");
			float num3 = scan.nextFloat();

			matriz(num1, num2, num3);

			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}

	public static void matriz(float x, float y, float z) {
		if (Math.abs(y - z) < x && x < y + z) {
			System.out.println("Lado X permitido");
		} else {
			System.out.println("Lado X não permitido");
		}
		if (Math.abs(x - z) < y && x < x + z) {
			System.out.println("Lado Y permitido");
		} else {
			System.out.println("Lado Y não permitido");
		}
		if (Math.abs(y - x) < z && x < y + x) {
			System.out.println("Lado Z permitido");
		} else {
			System.out.println("Lado Z não permitido");
		}
	}
}
