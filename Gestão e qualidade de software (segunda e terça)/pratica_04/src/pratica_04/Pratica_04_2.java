package pratica_04;

import java.util.Scanner;

public class Pratica_04_2 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		int lado1, lado2, lado3;
		do {
			System.out.println("lado1: ");
			lado1 = scan.nextInt();
			System.out.println("lado2: ");
			lado2 = scan.nextInt();
			System.out.println("lado3: ");
			lado3 = scan.nextInt();

			tipoTrian(lado1, lado2, lado3);
		} while (lado1 != -1 && lado2 != -1 && lado3 != -1);
	}

	public static void tipoTrian(int num1, int num2, int num3) {
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			if (num1 == num2 && num2 == num3) {
				System.out.println("Equilátero");
			} else {
				System.out.println("Isóceles");
			}
		} else {
			System.out.println("Escaleno");
		}
	}
}
