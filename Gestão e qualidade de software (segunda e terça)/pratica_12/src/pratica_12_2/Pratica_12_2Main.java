package pratica_12_2;

import java.util.Scanner;

public class Pratica_12_2Main {

	public static void pratica() throws Divisao {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("numero 1: ");
			int num1 = scan.nextInt();

			System.out.print("numero 2: ");
			int num2 = scan.nextInt();
			
			System.out.println("resultado " + new Divisao(num1, num2).dividir());
			
			
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
