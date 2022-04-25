package pratica_04;

import java.util.Scanner;

public class Pratica_04_4 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			System.out.print("Digite o peso: ");
			float num1 = scan.nextFloat();

			System.out.print("Digite a altura: ");
			float num2 = scan.nextFloat();

			IMC(num1, num2);
			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}

	public static void IMC(float peso, float altura) {
		float IMC = peso / (altura * altura);

		if (IMC < 20f) {
			System.out.println("Abaixo do Peso");
		} else if (IMC >= 20f && IMC < 25f) {
			System.out.println("Normal");
		} else if (IMC >= 25f && IMC < 30f) {
			System.out.println("Sobrepeso");
		} else if (IMC >= 30f && IMC < 40f) {
			System.out.println("Obesidade");
		} else if (IMC >= 40f) {
			System.out.println("Obesidade Mórbida");
		}
	}
}
