package pratica_12;

import java.util.Scanner;

public class Pratica_12_1 {

	public static void pratica() throws ArithmeticException {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("numero 1: ");
			int num1 = scan.nextInt();

			System.out.print("numero 2: ");
			int num2 = scan.nextInt();

			/*
			 * if (num2 == 0) throw new
			 * ArithmeticException("Não é possivel dividir por 0 !");
			 */ System.err.println("resultado " + num1 / num2);

		} catch (ArithmeticException e) {
			System.out.println("Não é possivel dividir por 0 !");
		}

	}
}
