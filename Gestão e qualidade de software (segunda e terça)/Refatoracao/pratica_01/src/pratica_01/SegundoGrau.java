package pratica_01;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			
			System.out.print("a: ");
			int a = scan.nextInt();

			System.out.print("b: ");
			int b = scan.nextInt();

			System.out.print("c: ");
			int c = scan.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				System.out.println("Igualdade confirmada: 0 = 0");
			} else if (a == 0 && b == 0 && c != 0) {
				System.out.println("Coeficientes informados incorretamente");
			} else if (a == 0 && b != 0) {
				System.out.println("Esta � uma equa��o de primeiro grau");
			} else {
				System.out.println("Esta � uma equa��o de segundo grau");
				int discr = (b * b) - (4 * a * c);
				if (discr < 0) {
					System.out.println("Esta equa��o n�o possui ra�zes reais");
				} else if (discr == 0) {
					System.out.println("Esta equa��o possui duas ra�zes reais iguais" + "\nx1 = " + (-b + Math.sqrt(discr)) / 2
							+ " | x2 = " + (-b - Math.sqrt(discr)) / 2);
				} else {
					System.out.println("Esta equa��o possui duas ra�zes reais diferentes"
							+ "");
				}

			}

			// System.out.println("resultado " + new SegundoGrau(num1, num2,
			// num3).dividir());

		} catch (ArithmeticException e) {
			// System.out.println(e.getLocalizedMessage());
		}

	}

}
