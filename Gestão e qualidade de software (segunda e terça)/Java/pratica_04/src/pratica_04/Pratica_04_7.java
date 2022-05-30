package pratica_04;

import java.util.Scanner;

public class Pratica_04_7 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			System.out.print("Digite o valor de A: ");
			float num1 = scan.nextFloat();

			System.out.print("Digite o valor de B: ");
			float num2 = scan.nextFloat();

			System.out.print("Digite o valor de C: ");
			float num3 = scan.nextFloat();

			segundoGrau(num1, num2, num3);

			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}

	public static void segundoGrau(float a, float b, float c) {
		float delta = (b * b) - (4 * a * c);
		if (a == 0 && b == 0 && c == 0) {
			System.out.println("Igualdade confirmada: 0 = 0");
		} else if (a == 0 && b == 0 && c != 0) {
			System.out.println("Coeficientes informados incorretamente");
		} else if (a == 0 && b != 0) {
			System.out.println("Esta � uma equa��o de primeiro grau\n" + "x = " + b / -c);
		} else if (a != 0 && delta < 0) {
			System.out.println("Esta equa��o n�o possui ra�zes reais");
		} else if (a != 0 && delta == 0) {
			System.out.println("Esta equa��o possui duas ra�zes reais iguais\n" + "x = " + -b / 2 * a);
		} else if (a != 0 && delta > 0) {
			System.out.println("Esta equa��o possui duas ra�zes reais diferentes\n" + "x1 = "
					+ (-b + Math.sqrt(delta) / 2 * a) + "\nx2 = " + (-b - Math.sqrt(delta) / 2 * a));
		}
	}
}
