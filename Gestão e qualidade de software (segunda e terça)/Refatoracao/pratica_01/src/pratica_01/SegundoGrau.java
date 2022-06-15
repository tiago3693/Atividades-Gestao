package pratica_01;

import java.util.Scanner;

public class SegundoGrau {

	public static void pratica() throws ArithmeticException {
		Scanner scan = new Scanner(System.in);
		try {
			String opcao = "s";
			do {
				System.out.print("a: ");
				double a = scan.nextInt();

				System.out.print("b: ");
				double b = scan.nextInt();

				System.out.print("c: ");
				double c = scan.nextInt();

				if (a == 0)
					if (b == 0)
						if (c == 0)
							System.out.println("Igualdade confirmada: 0 = 0");
						else
							System.out.println("Coeficientes informados incorretamente.");
					else {
						System.out.println("Esta é uma equação de primeiro grau.");
						System.out.println("x = " + (-c / b));
					}
				else {
					System.out.println("Esta é uma equação de segundo grau.");
					double discr = (b * b) - (4 * a * c);
					if (discr < 0)
						System.out.println("Esta equação não possui raízes reais.");
					else if (discr == 0)
						System.out.println(
								"Esta equação possui duas raízes reais iguais" + "\nx1 = x2 = " + -b / (2 * a));
					else {
						System.out.println("Esta equação possui duas raízes reais diferentes.");
						System.out.println("x1 =" + ((-b + Math.sqrt(discr)) / (2 * a)));
						System.out.println("x2 =" + ((-b - Math.sqrt(discr)) / (2 * a)));
					}
				}
				System.out.println("Deseja continuar ? ");
				opcao = scan.next();
			} while (opcao.equalsIgnoreCase("s"));
		} catch (ArithmeticException e) {
			e.getStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			scan.close();
		}

		/*
		 * try (Scanner scan = new Scanner(System.in)) {
		 * 
		 * 
		 * System.out.print("a: "); int a = scan.nextInt();
		 * 
		 * System.out.print("b: "); int b = scan.nextInt();
		 * 
		 * System.out.print("c: "); int c = scan.nextInt();
		 * 
		 * if (a == 0 && b == 0 && c == 0) {
		 * System.out.println("Igualdade confirmada: 0 = 0"); } else if (a == 0 && b ==
		 * 0 && c != 0) { System.out.println("Coeficientes informados incorretamente");
		 * } else if (a == 0 && b != 0) {
		 * System.out.println("Esta é uma equação de primeiro grau"); } else {
		 * System.out.println("Esta é uma equação de segundo grau"); int discr = (b * b)
		 * - (4 * a * c); if (discr < 0) {
		 * System.out.println("Esta equação não possui raízes reais"); } else if (discr
		 * == 0) { System.out.println("Esta equação possui duas raízes reais iguais" +
		 * "\nx1 = " + (-b + Math.sqrt(discr)) / 2 + " | x2 = " + (-b -
		 * Math.sqrt(discr)) / 2); } else {
		 * System.out.println("Esta equação possui duas raízes reais diferentes" + "");
		 * }
		 * 
		 * }
		 * 
		 * // System.out.println("resultado " + new SegundoGrau(num1, num2, //
		 * num3).dividir());
		 * 
		 * } catch (ArithmeticException e) { //
		 * System.out.println(e.getLocalizedMessage()); }
		 */

	}

}
