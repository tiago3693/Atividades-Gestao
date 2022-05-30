package pratica_07;

import java.util.Scanner;

public class Pratica_07_3 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		int num1;
		do {
		System.out.print("Selecione o numero: ");
		num1 = scan.nextInt();
		if (num1 <= 0)
			System.out.println("numero invalido");
		} while (num1 <= 0);
		for (int i = num1 - 1; i > 1; i--) {
			num1 *= i;
			System.out.println(num1);
		}
	}
}
